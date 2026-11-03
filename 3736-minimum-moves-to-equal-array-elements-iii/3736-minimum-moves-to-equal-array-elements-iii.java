class Solution {
    public int minMoves(int[] nums) {

        int greatest = nums[0];
        int ans = 0;

        for (int num : nums) {
            greatest = Math.max(num, greatest);
        }

        for (int num : nums) {
            ans += greatest - num;
        }
        return ans;
    }
}