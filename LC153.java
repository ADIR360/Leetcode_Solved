class Solution {
    public int maxProduct(int[] nums) {
        int sum=1;
        int max=Integer.MIN_VALUE;
       int i;

       for(i=0;i<nums.length;i++)
       {
        sum=sum*nums[i];
        max=Math.max(sum,max);
       }
        return max;
        
    }
}
  
