class Solution {
public:
    bool isPalindrome(string s) {
        string st="";
        for(char ch:s){
            if(isalnum(ch)){
                st+=tolower(ch);
            }
        }
        string temp=st;
        reverse(temp.begin(),temp.end());
        if(temp==st){
            return true;
        }
        return false;
    }
};