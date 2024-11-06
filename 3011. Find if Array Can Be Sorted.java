class Solution {
    public boolean canSortArray(int[] nums) {
        int bitCount=Integer.bitCount(nums[0]);
        int prevMax=-1;
        int currMax=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(Integer.bitCount(nums[i])!=bitCount)
            {
                bitCount=Integer.bitCount(nums[i]);
                prevMax=Math.max(currMax,prevMax);
                currMax=nums[i];
            }
            else
            {
                currMax=Math.max(currMax,nums[i]);
            }
            if(prevMax!=-1 && nums[i]<prevMax) return false;
        }
            return true;
    }
}
