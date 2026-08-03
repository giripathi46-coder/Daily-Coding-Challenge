class Solution {
    public int maxProfit(int[] prices) {
        int sp =  prices[0];
        int profit = 0;
        for(int i=0;i<prices.length;i++){
            if(sp>prices[i]){
                sp = prices[i];
            }

            if(profit<(prices[i] - sp)){
                profit = prices[i] - sp;
            }

        }
        return profit;

    }
}