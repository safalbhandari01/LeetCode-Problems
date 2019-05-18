class Solution {
    public int maxProfit(int[] prices) {
        int size = prices.length;
        int buy = 0;
        int sell =0;
        int totalProfit = 0;
        for(int i=0; i<size-1;i++)
        {
           if(prices[i]<prices[i+1])
            {
                buy = prices[i];
                
                while(i< size-1 && prices[i]<prices[i+1])
                {
                    
                      i++;  
                    
                    
                }
                sell = prices[i];
                totalProfit +=  (sell- buy);
                
            }
        }//End of For loop
        
        return totalProfit;
    }
}
