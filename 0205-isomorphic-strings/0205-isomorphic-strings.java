class Solution {
    public boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            Character sValue = sMap.get(sChar);
            Character tValue = tMap.get(tChar);

            if ((sValue != null && sValue != tChar) ||
                (tValue != null && tValue != sChar)) {
                return false;
            }
            sMap.put(sChar, tChar);
            tMap.put(tChar, sChar);
        }
        return true;
    }
}