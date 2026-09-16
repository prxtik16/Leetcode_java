class Solution {
    public String largestOddNumber(String num) {
       int lastdigit=-1;
       for(int i=num.length()-1;i>=0;i--){
       if((num.charAt(i)-'0')%2!=0){
         lastdigit=i;
         break;
       }
       } 
       if(lastdigit==-1) return "";
       
       int start=0;
       while(start<lastdigit && num.charAt(start)=='0'){
        start++;
       }
       return num.substring(start,lastdigit+1);
    }
}