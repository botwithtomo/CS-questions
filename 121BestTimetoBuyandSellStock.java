//121 Best Time to Buy and Sell Stock
// Easy
/*
Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Example 1:
Input: [7, 1, 5, 3, 6, 4]
Output: 5

max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be larger than buying price)
Example 2:
Input: [7, 6, 4, 3, 1]
Output: 0

In this case, no transaction is done, i.e. max profit = 0.
*/

// This is method 1;
public int maxProfit(int[] prices) {
	if(prices.length<2 || prices == null) return 0;
	int rst = 0, minPrice = prices[0];
	for(int i =1; i<prices.length;i++){
		if(prices[i]<minPrice) 
			minPrice= prices[i];
		else
			rst = Math.max(prices[i]-minPrice,rst);
		
	}
	return rst;
}
//This is second method, they are basically the same
public static int maxProfit(int[] prices) {
        if(prices==null||prices.length<=1)
            return 0;

        int min=prices[0]; // min so far
        int result=0;

        for(int i=1; i<prices.length; i++){
            result = Math.max(result, prices[i]-min);
            min = Math.min(min, prices[i]);
        }

        return result;
    }