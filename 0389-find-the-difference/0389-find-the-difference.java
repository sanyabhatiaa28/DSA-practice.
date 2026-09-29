class Solution {
    public char findTheDifference(String s, String t) {
        long sum=0;
        long diff=0;
        for(char ch:t.toCharArray()){
            sum+=ch-'a';
        }
        for(char ch: s.toCharArray()){
            diff+=ch-'a';
        }
        return (char) (sum-diff+'a');
    }
}