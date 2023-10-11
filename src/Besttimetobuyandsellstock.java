/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
*/
public class Besttimetobuyandsellstock {
    public static void main(String[] args){
        int prices[] = {7,2,5,3,6,4};
        int buyingprice = prices[0];
        int profit = 0;
        if(prices == null || prices.length == 0){
            System.out.println(0);
        }
        for(int i=1; i<prices.length; i++){
            if(prices[i] <= buyingprice){
                buyingprice = prices[i];
                continue;
            }
            profit = Math.max(profit, (prices[i] - buyingprice));
        }
        System.out.println(profit);
    }
}
