class Solution {
public:
    vector<int> findMissingElements(vector<int>& nums) {
        int min=INT_MAX,max=INT_MIN;
        vector<int> ans;
        for(int i=0;i<nums.size();i++){
            if(min>nums[i])
                min=nums[i];
            if(max<nums[i])
                max=nums[i];
        }

        unordered_set<int> st;
        for (int x : nums)
            st.insert(x);

        for(int i=min;i<=max;i++){
            if(st.find(i)==st.end())
                ans.push_back(i);
        }
        return ans;
    }
};