class Solution {
    public int[] shuffle(int[] nums, int n) {

        int[] result=new int[2*n];
        
        int i=0;
        int j=n;

        while(i<2*n){
            
            result[i]=nums[i/2];
            result[i+1]=nums[j];
            
            i=i+2;
            j++;

        }
        return result;
    }
}