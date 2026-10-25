class Solution {

    int dayOfYear(String s) {

        int month = Integer.valueOf(s.substring(0, 2));
        int day = Integer.valueOf(s.substring(3, 5));

        switch (month) {
            case 1:
                return day;
            case 2:
                return 31 + day;
            case 3:
                return 31 + 28 + day;
            case 4:
                return 31 + 28 + 31 + day;
            case 5:
                return 31 + 28 + 31 + 30 + day;
            case 6:
                return 31 + 28 + 31 + 30 + 31 + day;
            case 7:
                return 31 + 28 + 31 + 30 + 31 + 30 + day;
            case 8:
                return 31 + 28 + 31 + 30 + 31 + 30 + 31 + day;
            case 9:
                return 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + day;
            case 10:
                return 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + day;
            case 11:
                return 31 + 28 + 31 + 30 + 31 + 30 + 31 +
                        31 + 30 + 31 + day;
            case 12:
                return 31 + 28 + 31 + 30 + 31 + 30 + 31 +
                        31 + 30 + 31 + 30 + day;
        }
        return -1;
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