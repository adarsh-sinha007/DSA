class Solution {
    public String addStrings(String num1, String num2) {
        int n1=num1.length()-1;
        int n2=num2.length()-1;
        int carry=0;String ans="";
        int sum=0;
        
        while(n1>=0 && n2>=0){
            int digit1=num1.charAt(n1)-'0';
            int digit2=num2.charAt(n2)-'0';
             sum=digit1+digit2+carry;
            carry=sum/10;
            sum=sum%10;
            ans=sum+ans;
            n1--;
            n2--;
        }
        while(n1>=0){
            int digit1=num1.charAt(n1)-'0';
             sum=digit1+carry;
            carry=sum/10;
            sum=sum%10;
            ans=sum+ans;
            n1--;
        }
        while(n2>=0){
            int digit2=num2.charAt(n2)-'0';
            sum=digit2+carry;
            carry=sum/10;
            sum=sum%10;
            ans=sum+ans;
            n2--;
        }
        if(carry==1){
            ans="1"+ans;
        }
        return ans;
            
            
        
    }
}