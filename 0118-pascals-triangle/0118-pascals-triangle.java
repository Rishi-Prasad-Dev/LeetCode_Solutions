class Solution {

    List<Integer> row(int n) {

        List<Integer> row = new ArrayList<>();
        long prod = 1;
        row.add(1);

        for (int i = 1; i < n; i++) {
            prod *= n - i;
            prod /= i;
            row.add((int) prod);
        }
        return row;
    }

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 1; i <= numRows; i++) {
            ans.add(row(i));
        }
        return ans;
    }
}