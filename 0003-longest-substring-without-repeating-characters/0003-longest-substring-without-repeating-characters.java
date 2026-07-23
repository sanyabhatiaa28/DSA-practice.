class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        if(n<1){
            return 0;
        }
        int l=0;
        int maxlen=Integer.MIN_VALUE;
        Set<Character>set=new HashSet<>();
        for(int r=0;r<n;r++){
            char ch=s.charAt(r);
            while(set.contains(ch)){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(ch);
            maxlen=Math.max(maxlen,r-l+1);
        }
        return maxlen==Integer.MAX_VALUE?0:maxlen;
    }
}