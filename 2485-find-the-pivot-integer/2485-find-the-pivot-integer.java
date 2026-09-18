class Solution {
    public int pivotInteger(int n) {

        int sum = n * (n + 1) / 2;
        int pivot = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum - i;
            if (pivot == sum) {
                return i;
            } else {
                pivot += i;
            }
        }
        return -1;
    }
}