class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int left = 0;
        int right = arr.length - k; // window start can be at most here

        while (left < right) {
            int mid = left + (right - left) / 2;

            // compare distance of left edge vs element just past right edge
            if (x - arr[mid] > arr[mid + k] - x) {
                left = mid + 1;  // left edge too far → slide right
            } else {
                right = mid;     // right edge too far or equal → try left
            }
        }

        List<Integer> result = new ArrayList<>(k);
        for (int i = left; i < left + k; i++) {
            result.add(arr[i]);
        }
        return result;
    }
}