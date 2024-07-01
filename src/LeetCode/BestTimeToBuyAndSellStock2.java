package LeetCode;

public class BestTimeToBuyAndSellStock2 {
    public int maxProfit(int[] prices) {
/*
        int total = 0;
        int valley = Integer.MAX_VALUE;
        int peak = valley;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i] < peak){
                total += peak - valley;
                valley = prices[i];
                peak = valley;
            }else{
                peak = prices[i];
            }
        }
        total += peak - valley;
        return total;
 */
        int total = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i] > prices[i-1]){
                total += prices[i] - prices[i-1];
            }
        }
        return total;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStock2 bst = new BestTimeToBuyAndSellStock2();
        int i = bst.maxProfit(new int[]{7, 1, 5, 3, 6, 4});
        System.out.println(i);
    }
}
