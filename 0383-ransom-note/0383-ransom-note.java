class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap <Character,Integer> magazineFreq = new HashMap<>();

        for(int i=0;i<magazine.length();i++){

            char ch=magazine.charAt(i);
            magazineFreq.put(ch,magazineFreq.getOrDefault(ch,0)+1);
        }

        for(int i=0;i<ransomNote.length();i++){

            char ch=ransomNote.charAt(i);

            if(!magazineFreq.containsKey(ch) || magazineFreq.get(ch)==0){
                return false;
            }
            magazineFreq.put(ch,magazineFreq.get(ch)-1);
        }
        return true;
    }
}