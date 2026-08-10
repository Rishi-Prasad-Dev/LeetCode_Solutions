class Solution {
public:
    int firstUniqChar(string s) {
        unordered_map <char,int> freq;
        for(auto st:s){
            freq[st]++;
        }
        for(int i=0;i<s.length();i++){
            if(freq[s[i]]==1)
                return i;
        }
        return -1;
    }
};