class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int minp=prices[0];
        int maxprofit=0;
        for(int i=0;i<n;i++){
            minp=Math.min(minp,prices[i]);
            maxprofit=Math.max(maxprofit,prices[i]-minp);
        }
        return maxprofit;
    }
}