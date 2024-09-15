public class sharemarket {
    public static int marketprofit(int prices[]) {
        int buy_price = Integer.MAX_VALUE;
        int max_profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < buy_price) {
                buy_price = prices[i];
            } else {
                int profit = prices[i] - buy_price;
                max_profit = Math.max(max_profit, profit);
            }
        }
        return max_profit;
    }

    public static void main(String[] args) {
        int prices[] = {7, 6,4,3,1};
        System.out.println(marketprofit(prices));
    }
}
