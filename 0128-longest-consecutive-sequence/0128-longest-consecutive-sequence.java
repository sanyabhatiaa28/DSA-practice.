class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer>set=new HashSet<>();
        for(int x:nums){
            set.add(x);
        }
        int longest=0;
        for(int x:set){
            if(!set.contains(x-1)){
                int cur=x;
                int len=1;
                while(set.contains(cur+1)){
                    cur++;
                    len++;
                }
                longest=Math.max(longest,len);
            }
        }
        return longest;
    }
}