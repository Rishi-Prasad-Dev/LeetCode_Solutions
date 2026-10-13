class Solution {
    public long maxAlternatingSum(int[] nums) {

        int n = nums.length;
        long[] squares = new long[n];
        long sum = 0;

        for (int i = 0; i < n; i++) {
            squares[i] += nums[i] * nums[i];
        }

        Arrays.sort(squares);

        for (int i = 0; i < n / 2; i++) {
            sum -= squares[i];
        }

        for (int i = n / 2; i < n; i++) {
            sum += squares[i];
        }
        return sum;
    }
}