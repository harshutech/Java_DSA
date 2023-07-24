import java.util.*;
public class sell_buyStock {

    // buy sell stock price calculate
    public static int sellBuyPrice(int prices[]){
        int buy_price = Integer.MAX_VALUE;
        int max_profit = 0;
        
        for(int sell_price=0; sell_price<prices.length; sell_price++){
            if(buy_price < prices[sell_price]){
                int profit = prices[sell_price] - buy_price;
                max_profit = Math.max(max_profit, profit);
            }
            else{
                buy_price = prices[sell_price];
            }
        }
        return max_profit;
    }
    


    public static void main(String[] args) {

        int prices[] = {7,1,5,3,6,4}; // time complexity is 0(n)
        System.out.print(sellBuyPrice(prices));

    }
}
