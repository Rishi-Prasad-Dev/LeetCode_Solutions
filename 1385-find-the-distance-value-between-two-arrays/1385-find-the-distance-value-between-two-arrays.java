class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;

        for (int n : arr1) {
            boolean valid = true;

            for (int num : arr2) {
                if (Math.abs(n - num) <= d) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                count++;
            }
        }
        return count;
    }
}