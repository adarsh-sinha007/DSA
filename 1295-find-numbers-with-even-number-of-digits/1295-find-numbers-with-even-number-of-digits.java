class Solution {
    public int findNumbers(int[] nums) {
      return(count(nums));
        
    }
    int count(int arr[]){
        int c=0;
    
        for(int n:arr){
             String str="";
            str+=n;
                int len=str.length();
            if(len%2==0){
                c++;
            }
        }
        return c;
    }
}