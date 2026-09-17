class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {

        Arrays.sort(arr);
        
        int firstDiff = arr[0] - arr[1];
        int diff = 0;

        for (int i = 1; i < arr.length - 1; i++) {

            diff = arr[i] - arr[i + 1];

            if (firstDiff != diff) {
                return false;
            }
        }
        return true;
    }
}