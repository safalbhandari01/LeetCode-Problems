class Solution {
    public int removeDuplicates(int[] nums) {
        
        int countRepetition = 0;
        int k =0;
        int size = nums.length;
        for (int i=0; i<nums.length-1-k; i++)
        {
            
            if(nums[i]==nums[i+1])
            {
                //Keeping count of repeated elements
                countRepetition++;
                k++;
                for(int j = i; j<nums.length-1; j++)
                {
                    nums[j] = nums[j+1];
                }//end of Inner for loop
                
                i--;
            }
        }//end of Outer for loop
        
        int returnLength = nums.length-countRepetition;
        
        return returnLength;
        
    }
}
