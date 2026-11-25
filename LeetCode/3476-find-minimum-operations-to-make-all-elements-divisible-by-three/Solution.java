class Solution {
    public int minimumOperations(int[] nums) {
        int count=0;
        int n =nums.length;

        for(int i=0;i<n;i++){
            if(nums[i]%3!=0){//there will be always one operation either remainder will be 1 or 2 in  one case decrease by 1 in case two increaseb by 1
                count++;
            }
        }
        return count;
        
    }
}