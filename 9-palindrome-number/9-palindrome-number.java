class Solution {
    public boolean isPalindrome(int x) {
        int rem,sum=0;
        int n=x;
        while(x>0){
            rem=x%10;
            sum=(sum*10)+rem;
             x=x/10;
            
        }
        if(sum==n){
            return true;
        }
       
        else
        {
        return false;
        }
    }
}