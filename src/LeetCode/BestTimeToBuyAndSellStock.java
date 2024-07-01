package LeetCode;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
/*


        int largestDifference = 0;
        for (int buyDay = 0; buyDay < prices.length; buyDay++) {
            for (int sellDay = buyDay + 1; sellDay < prices.length; sellDay++) {
                int currentDifference = prices[sellDay] - prices[buyDay];
                if (currentDifference > largestDifference) {
                    largestDifference = currentDifference;
                }
            }
        }
        return largestDifference;
*/
        int largestDifference = 0;
        int midSoFar = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i] < midSoFar){
                midSoFar = prices[i];
            }else{
                largestDifference = Math.max(largestDifference, prices[i] - midSoFar);
            }
        }
        return largestDifference;

    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStock bst = new BestTimeToBuyAndSellStock();
        int i = bst.maxProfit(new int[]{7, 1, 5, 3, 6, 4});
        System.out.println(i);
    }
}
