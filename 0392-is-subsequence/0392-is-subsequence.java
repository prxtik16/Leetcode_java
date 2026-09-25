class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0,j=0;
        boolean subseq=true;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j))
            i++;
            j++;
        }
        if(i!=s.length()) subseq=false;
        return subseq;
    }
}