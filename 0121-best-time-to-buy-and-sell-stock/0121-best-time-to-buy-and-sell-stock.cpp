class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int min=INT_MAX,max_profit=0;
        for(int i=0;i<prices.size();i++){
            if(min>prices[i]){
                min=prices[i];
            }
            if(max_profit<prices[i]-min){
                max_profit=prices[i]-min;
            }
        }
    return max_profit;
    }
};