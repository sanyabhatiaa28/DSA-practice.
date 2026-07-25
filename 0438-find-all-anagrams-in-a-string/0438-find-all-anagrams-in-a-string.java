class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer>res=new ArrayList<>();
        int m=s.length();
        int n=p.length();
        int l=0;
        if(n>m) return res;
        int[] pfreq=new int[26];
        int[] winfreq=new int[26];
        for(int i=0;i<n;i++){
            pfreq[p.charAt(i)-'a']++;
        }
        for(int r=0;r<m;r++){
            winfreq[s.charAt(r)-'a']++;
            if(r-l+1==n){
                if(matches(pfreq,winfreq)){
                    res.add(l);
                }
                winfreq[s.charAt(l)-'a']--;
                l++;
            }
        }
        return res;
    }
    private boolean matches(int[]a,int[]b){
        for(int i=0;i<26;i++){
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }
}