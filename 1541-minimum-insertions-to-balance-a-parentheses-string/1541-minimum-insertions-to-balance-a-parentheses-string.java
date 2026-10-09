class Solution {
    public int minInsertions(String s) {

        int openCount = 0;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == '(') {
                openCount++;
            } else {

                if ((i + 1) < s.length() && s.charAt(i + 1) == ')') {
                    i++;
                } else {
                    count++;
                }
                if (openCount > 0) {
                    openCount--;
                } else {
                    count++;
                }
            }
        }
        return count + 2 * openCount;
    }
}