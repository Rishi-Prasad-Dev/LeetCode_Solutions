class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int num = left; num <= right; num++) {

            int temp = num;
            boolean valid = true;

            while (temp != 0) {

                int digit = temp % 10;

                if (digit == 0 || num % digit != 0) {
                    valid = false;
                }
                temp /= 10;
            }

            if (valid) {
                list.add(num);
            }
        }
        return list;
    }
}