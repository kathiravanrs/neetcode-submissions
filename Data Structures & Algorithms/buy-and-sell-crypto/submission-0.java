class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int l=0, r=prices.length-1;
        while(l<r){
            profit = Math.max(profit, prices[r]-prices[l]);
            if(prices[l+1]<prices[l])l++;
            else if(prices[r-1]>prices[r]) r--;
            else{
                r--;l++;
            }
        }
        return profit;
    }
}
