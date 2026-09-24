class Solution {
    public int maxProfit(int[] prices) {
        // Code here
        int n = prices.length;
        int min = prices[0];
        int prof = 0;
        
        for(int i =1;i<n;i++){
            
            int cost = prices[i] - min;
            prof = Math.max(prof,cost);
            min= Math.min(prices[i],min);
        }
        return prof;
    }
}