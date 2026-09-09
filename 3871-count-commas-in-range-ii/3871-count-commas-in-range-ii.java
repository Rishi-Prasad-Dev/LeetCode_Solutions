class Solution {
    public long countCommas(long n) {

        long count = 0;

        for (long pos = 1000; pos <= n; pos *= 1000) {
            count += n - pos + 1;
        }
        return count;
    }
}