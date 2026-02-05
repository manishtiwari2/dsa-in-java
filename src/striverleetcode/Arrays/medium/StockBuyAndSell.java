package striverleetcode.Arrays.medium;

public class StockBuyAndSell {

    public int maxProfit(int[] prices) {
        int profit = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }
            int curr = prices[i] - min;
            profit = Math.max(curr, profit);
        }

        return profit;
    }

    public static void main(String[] args) {
        StockBuyAndSell obj = new StockBuyAndSell();
        int[] prices = {7, 1, 5, 3, 6, 4};
        int result = obj.maxProfit(prices);
        System.out.println("Maximum Profit: " + result);
    }
}

// Optimal apptoach

//Only one buy and one sell allowed, Buy must happen before sell
//Track minimum price so far while traversing
//At each step, calculate profit if sold today, Keep updating maximum profit


// Brute force approach
//public int maxProfit(int[] prices) {
//    int profit = 0;
//
//    for (int i = 0; i < prices.length; i++) {
//        for (int j = i + 1; j < prices.length; j++) {
//            int curr = prices[j] - prices[i];
//            if (curr > profit) {
//                profit = curr;
//            }
//        }
//    }
//    return profit;
//}