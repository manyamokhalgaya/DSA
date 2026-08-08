class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

        // Step 1: Check if making m bouquets is
        // possible with the total number of flowers
        if ((long) m * k > bloomDay.length) {
            return -1;
        }

        // Step 2: Find the minimum and maximum bloom days
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for (int day : bloomDay) {
            low = Math.min(low, day);
            high = Math.max(high, day);
        }

        // Step 3: Binary Search for the minimum possible day
        while (low < high) {

            int mid = low + (high - low) / 2;

            // Can we make m bouquets by 'mid' days?
            if (canMake(bloomDay, m, k, mid)) {
                // Yes → try fewer days
                high = mid;
            } else {
                // No → need more days
                low = mid + 1;
            }
        }

        return low;
    }

    // Checks whether we can make m bouquets
    // by the given number of days
    private boolean canMake(int[] bloomDay, int m, int k, int day) {

        int flowers = 0;
        int bouquets = 0;

        for (int bloom : bloomDay) {

            // Flower has bloomed
            if (bloom <= day) {
                flowers++;
            } 
            // Flower has NOT bloomed
            else {
                // Consecutive group is broken
                flowers = 0;
            }

            // We have k consecutive flowers
            if (flowers == k) {
                bouquets++;

                // These flowers are already used
                flowers = 0;
            }

            // We already have enough bouquets
            if (bouquets >= m) {
                return true;
            }
        }

        return false;
    }
}