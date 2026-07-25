class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int m=s1.length();
        int n=s2.length();
        if(m>n)return false;
        int l=0;
        int freq1[]=new int[26];
        int winfreq[]=new int[26];
        for(int i=0;i<m;i++){
            freq1[s1.charAt(i)-'a']++;
        }
        for(int r=0;r<n;r++){
            winfreq[s2.charAt(r)-'a']++;
            if(r-l+1==m){
                if(ismatch(freq1,winfreq)){
                    return true;
                }
                winfreq[s2.charAt(l)-'a']--;
                l++;
            }
        }
        return false;
    }
    private boolean ismatch(int[]a,int[]b){
        for(int i=0;i<26;i++){
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }
}