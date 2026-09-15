class Solution {
    public String reverseWords(String s) {
        String[] word=s.trim().split("\\s+");
        int left=0,right=word.length-1;
        while(right>left){
            String temp=word[left];
            word[left]=word[right];
            word[right]=temp;
            left++;
            right--;
        }
        return String.join(" ",word);
    }
}
