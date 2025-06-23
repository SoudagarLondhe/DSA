The cost of stock on each day is given in an array price[]. Each day you may decide to either buy or sell the stock i at price[i], you can even buy and sell the stock on the same day. Find the maximum profit that you can get.

Note: A stock can only be sold if it has been bought previously and multiple stocks cannot be held on any given day.

Examples:

Input: prices[] = [100, 180, 260, 310, 40, 535, 695]
Output: 865
Explanation: Buy the stock on day 0 and sell it on day 3 => 310 – 100 = 210. Buy the stock on day 4 and sell it on day 6 => 695 – 40 = 655. Maximum Profit = 210 + 655 = 865.


Input: prices[] = [4, 2, 2, 2, 4]
Output: 2
Explanation: Buy the stock on day 3 and sell it on day 4 => 4 – 2 = 2. Maximum Profit = 2.
Constraints:
1 <= prices.size() <= 105
0 <= prices[i] <= 104

------------------------

Sol1 :
// User function Template for Java
class Solution {
    public int maximumProfit(int prices[]) {
        // code here
        if(prices.length==0)
        {
            return 0;
        }
        int buy=prices[0], sell, total=0;
        
        for(int i=1;i<prices.length;)
        {
            if(prices[i]<buy)
            {
                buy = prices[i];
                i++;
                while(i<prices.length && prices[i]<buy)
                {
                    buy = prices[i];
                    i++;
                }
            }
            else
            {
                sell = prices[i];
                i++;
                while(i<prices.length && prices[i]>sell)
                {
                    sell=prices[i];
                    i++;
                }
                
                total = total + (sell-buy);
                
                if(i<prices.length){
                    buy=prices[i];
                }
            }
        }
    
       return total;
        
    }
}
----------------------------

//Optimised solution : 
class Solution {
    public int maximumProfit(int prices[]) {
        if(prices.length == 0) {
            return 0;  // No transactions can be made if the array is empty
        }
        
        int totalProfit = 0;
        
        // Traverse the prices array
        for (int i = 1; i < prices.length; i++) {
            // If the price is higher than the previous day, add the profit
            if (prices[i] > prices[i - 1]) {
                totalProfit += prices[i] - prices[i - 1];
            }
        }
        
        return totalProfit;  // Return the total accumulated profit
    }
}
