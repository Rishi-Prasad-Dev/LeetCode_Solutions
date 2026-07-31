class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map <int,int> value;
        for(int i=0;i<nums.size();i++){
            int y=target-nums[i];
            if(value.find(y) !=value.end()){
                return{value[y],i};
            }
            value[nums[i]]=i;
        }
        return {};
    }
};