package Arrays;

public class BuySellStocks {
    public static int maxProfit(int price[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < price.length; i++){
            if (buyPrice < price[i]){
                int profit = price[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
            else {
                buyPrice = price[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = {1,2,3,4};
        System.out.println(maxProfit(prices));
    }
}
