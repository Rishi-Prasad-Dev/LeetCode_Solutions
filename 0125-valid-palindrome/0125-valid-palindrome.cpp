class Solution {
public:
    bool isPalindrome(string s) {
        string st="";
        for(char ch:s){
            if(isalnum(ch)){
                st+=tolower(ch);
            }
        }
        int j=st.length()-1;
        for(int i=0;i<st.length();i++){
            if(st[i]!=st[j])
                return false;
            else
                j--;
        }
        return true;
    }
};