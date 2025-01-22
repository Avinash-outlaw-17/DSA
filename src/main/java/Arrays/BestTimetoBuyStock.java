package Arrays;

public class BestTimetoBuyStock {
    public static void main(String[] args) {
int [] prices = {7,1,5,3,6,4};
int res = maxProfit(prices);
        System.out.println(res);
    }

    public static int maxProfit(int[] prices){
      int buy = prices[0];
      int profit = 0;
      int n = prices.length;
        for (int i = 0; i < n; i++) {
            if(buy>prices[i]){
                buy = prices[i];
            }
            profit = Math.max(profit,prices[i]-buy);

        }
        return profit;
    }
}
