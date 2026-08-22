class Solution {
    public String reverseWords(String s) {

        StringBuilder result = new StringBuilder();

        int i=s.length()-1;
        while(i>=0){
            
            while(i>=0 && s.charAt(i)==' '){
                i--;
            }

            if(i<0){
                break;
            }

            int end=i;

            while(i>=0 && s.charAt(i)!=' '){
                i--;
            }

            int start=i+1;

            if(result.length()>0){
                result.append(' ');
            }

            for(int j=start;j<=end;j++){
                result.append(s.charAt(j));
            }
        }
        return result.toString();
    }
}