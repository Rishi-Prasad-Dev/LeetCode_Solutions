class Solution {
    public int firstStableIndex(int[] nums, int k) {

        int n = nums.length;

        int[] maxArr = new int[n];
        int[] minArr = new int[n];

        maxArr[0] = nums[0];

        for (int i = 1; i < n; i++) {
            maxArr[i] = Math.max(nums[i], maxArr[i - 1]);
        }

        minArr[n - 1] = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            minArr[i] = Math.min(nums[i], minArr[i + 1]);
        }

        for (int i = 0; i < n; i++) {

            int score = maxArr[i] - minArr[i];

            if (score <= k) {
                return i;
            }
        }
        return -1;
    }
}