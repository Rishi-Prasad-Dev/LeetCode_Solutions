class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int minSum = Integer.MAX_VALUE;

        for (int win = l; win <= r; win++) {
            int left = 0;
            int sum = 0;

            for (int right = 0; right < win; right++) {
                sum += nums.get(right);
            }

            for (int right = win - 1; right < nums.size(); right++) {

                if (sum > 0 && sum < minSum) {
                    minSum = sum;
                }

                if (right + 1 < nums.size()) {
                    sum -= nums.get(left);
                    left++;
                    sum += nums.get(right + 1);
                }
            }
        }

        if (minSum == Integer.MAX_VALUE) {
            return -1;
        } else {
            return minSum;
        }
    }
}