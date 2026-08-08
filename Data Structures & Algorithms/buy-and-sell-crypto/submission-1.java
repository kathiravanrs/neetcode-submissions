class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int l=0, r=1;
        while(r<prices.length){
            int cur = prices[r]-prices[l];
            if(cur<0){
                l=r;
            }
            else profit = Math.max(profit, cur);
            r++;
        }
        return profit;
    }
}
