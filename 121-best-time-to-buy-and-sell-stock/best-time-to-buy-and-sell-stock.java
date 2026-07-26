class Solution {
    public int maxProfit(int[] prices) {
       int buyprice=Integer.MAX_VALUE;
       int gain=0;
       for(int i=0;i<prices.length;i++){
        if(buyprice<prices[i]){
            int profit=prices[i]-buyprice;
            gain=Math.max(gain,profit);
        }
        else{
            buyprice=prices[i];
        }

       }
       return gain;
        
    }
}