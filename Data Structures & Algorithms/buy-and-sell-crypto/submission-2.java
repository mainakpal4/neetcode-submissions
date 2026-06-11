class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int sell=prices[0];
        int profit=sell-buy;
        for(int i=0;i<prices.length;i++){
            // int buy=prices[i];
            if(prices[i]<buy){
                buy=prices[i];
            }
            else{
                profit=Math.max(profit,prices[i]-buy);
            }

        }
        // if(profit>0){return profit;}
        // else return 0;
        return profit;
    }
}
