class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int m=s1.length();
        for(int i=0;i<=s2.length()-m;i++){
            String sub=s2.substring(i,i+m);
            if(ispermutation(s1,sub)){
                return true;
            }
        }
        return false;

    }
    private boolean ispermutation(String s, String t){
        int freq1[]=new int[26];
        int freq2[]=new int[26];
        for(int i=0;i<s.length();i++){
            freq1[s.charAt(i)-'a']++;
            freq2[t.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(freq1[i]!=freq2[i]){
                return false;
            }
        }
        return true;
    }
}