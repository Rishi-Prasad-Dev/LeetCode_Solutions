class Solution {
    public int[] rearrangeArray(int[] nums) {

        int n = nums.length;
        int j = 0;
        int k = 0;
        int[] pos = new int[n];
        int[] neg = new int[n];

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                pos[j] = nums[i];
                j++;
            } else {
                neg[k] = nums[i];
                k++;
            }
        }

        j = 0;
        k = 0;

        for (int i = 0; i < n - 1; i += 2) {
            nums[i] = pos[j];
            nums[i + 1] = neg[k];
            j++;
            k++;
        }
        return nums;
    }
}