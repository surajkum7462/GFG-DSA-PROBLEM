class Solution {
    public int getSecondLargest(int[] nums) {
        // code here
        int max=-1;
        int smax=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max)
            {
                smax=max;
                max=nums[i];
            }else if(nums[i]>smax && max!=nums[i])
            {
                smax=nums[i];
            }
        }
        return smax;
    
    }
}