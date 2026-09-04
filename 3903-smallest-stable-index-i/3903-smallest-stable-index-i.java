class Solution {
    public int firstStableIndex(int[] nums, int k) {

        int n = nums.length;

        int[] maximum = new int[n];
        int[] minimum = new int[n];

        maximum[0] = nums[0];

        for (int i = 1; i < n; i++) {
            maximum[i] = Math.max(nums[i], maximum[i - 1]);
        }

        minimum[n - 1] = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            minimum[i] = Math.min(nums[i], minimum[i + 1]);
        }

        for (int i = 0; i < n; i++) {

            int score = maximum[i] - minimum[i];

            if (score <= k) {
                return i;
            }
        }
        return -1;
    }
}