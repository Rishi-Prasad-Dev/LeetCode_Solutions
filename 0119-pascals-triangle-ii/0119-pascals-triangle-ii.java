class Solution {
    public List<Integer> getRow(int rowIndex) {

        long prod = 1;
        List<Integer> ans = new ArrayList<>();
        ans.add(1);

        for (int i = 1; i <= rowIndex; i++) {
            prod *= (rowIndex - i + 1);
            prod /= i;
            ans.add((int) prod);
        }
        return ans;
    }
}