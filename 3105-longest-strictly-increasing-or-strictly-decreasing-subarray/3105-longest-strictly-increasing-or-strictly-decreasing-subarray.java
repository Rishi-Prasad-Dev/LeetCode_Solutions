class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        int decLeft = 0;
        int incLeft = 0;
        int maxLength = 1;

        for (int right = 0; right < n - 1; right++) {

            if (nums[right] < nums[right + 1]) {
                int length = right - incLeft + 2;
                maxLength = Math.max(length, maxLength);
                decLeft = right + 1;
            } else if (nums[right] > nums[right + 1]) {
                int length = right - decLeft + 2;
                maxLength = Math.max(length, maxLength);
                incLeft = right + 1;
            } else {
                incLeft = right + 1;
                decLeft = right + 1;
            }
        }

        return maxLength;
    }
}