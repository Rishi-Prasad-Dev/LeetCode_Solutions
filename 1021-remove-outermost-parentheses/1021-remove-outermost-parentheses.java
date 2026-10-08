class Solution {
    public String removeOuterParentheses(String s) {

        int level = 0;
        StringBuilder ans = new StringBuilder();

        for (char ch : s.toCharArray()) {

            if (ch == ')') {
                level--;
            }
            if (level > 0) {
                ans.append(ch);
            }
            if (ch == '(') {
                level++;
            }
        }
        return ans.toString();
    }
}