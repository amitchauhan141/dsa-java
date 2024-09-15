public class Stocks {
    public static int BuyandSellstock(int prices[]){
        int buyprices = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0; i<prices.length;i++){
            if(buyprices<prices[i]){
                int Profit = prices[i]-buyprices;
                maxProfit = Math.max(maxProfit,Profit);
            }else{
                buyprices= prices[i];
            }
        }
        return maxProfit;

    }
    public static void main(String args[]){
        int prices[] = {7,1,5,3,6,4};
        System.out.println(BuyandSellstock(prices));

    }
}
