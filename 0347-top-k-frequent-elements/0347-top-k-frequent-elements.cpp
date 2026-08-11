bool compare(pair<int,int> a,pair<int,int> b){
    return a.second>b.second;
}
class Solution {
public:

    vector<int> topKFrequent(vector<int>& nums, int k) {

        unordered_map <int,int> freq;
        vector <pair<int,int>> v;
        vector<int> ans;

        for(int i:nums)
            freq[i]++;
        
        for(auto x:freq)
            v.push_back({x.first,x.second});

        sort(v.begin(),v.end(),compare);

        for(int i=0;i<k;i++){
            ans.push_back(v[i].first);
        }
        return ans;
    }
};