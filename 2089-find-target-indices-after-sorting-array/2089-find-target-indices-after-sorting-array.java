class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {

        List<Integer> ans = new ArrayList<>();
        int smaller = 0;
        int equal = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < target) {
                smaller++;
            } else if (nums[i] == target) {
                equal++;
            }
        }

        for (int i = smaller; i < smaller + equal; i++) {
            ans.add(i);
        }
        return ans;
    }
}