class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int l = 0;
        int r = 1;
        int minL = prices[l];
        while(r<prices.length){
            if(prices[r]<prices[l]){
                l=r;
                r++;
            }
            else{
                if(prices[r]-prices[l]>max){
                    max = prices[r]-prices[l];
                }
                r++;
            }
        }
       return max;
    }
}