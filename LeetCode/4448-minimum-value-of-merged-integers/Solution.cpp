class Solution {
public:
    int minMergedInteger(vector<int>& nums) {
        int left=0;
        int right=1;
        long long min1=LLONG_MAX;
        while(right<nums.size()){
            string min2;
            min2+=to_string(nums[left]);
            min2+=to_string(nums[right]);
            long long merged=stoll(min2);
            min1=min(min1,merged);
            left=left+2;
            right=right+2;
        }
        
        return min1;
    }
};