class Solution {
    public int smallestRepunitDivByK(int k) {

        int i = 0;
        int len = 0;

        while (len < k) {
            i = (i * 10 + 1) % k;
            len++;

            if (i == 0) {
                return len;
            }
        }
        return -1;
    }
}