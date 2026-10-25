class Solution {

    int dayOfYear(String s) {

        int month = Integer.parseInt(s.substring(0, 2));
        int day = Integer.parseInt(s.substring(3, 5));

        int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        for (int i = 0; i < month - 1; i++) {
            day += days[i];
        }
        return day;
    }

    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {

        int aliceArrive = dayOfYear(arriveAlice);
        int aliceLeave = dayOfYear(leaveAlice);
        int bobArrive = dayOfYear(arriveBob);
        int bobLeave = dayOfYear(leaveBob);

        int start = Math.max(aliceArrive, bobArrive);
        int end = Math.min(aliceLeave, bobLeave);

        if (start > end) {
            return 0;
        }
        return end - start + 1;
    }
}