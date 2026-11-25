class Solution {
    public int minMoves(int[] nums) {
        int min=nums[0];
        int sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            min=Math.min(nums[i],min);
            sum=sum+nums[i];
        }
        int count=sum-n*min;
        return count;

        
    }
}