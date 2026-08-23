class Solution {
    public int[] findErrorNums(int[] nums) {

        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();

        int duplicate = 0;

        for (int i = 0; i < n; i++) {
            if (set.contains(nums[i])) {
                duplicate = nums[i];
            } else {
                set.add(nums[i]);
            }
        }

        int missing = 0;

        for (int i=1;i<=n;i++) {
            if (!set.contains(i)) {
                missing = i;
                break;
            }
        }
        return new int[] { duplicate, missing };
    }
}