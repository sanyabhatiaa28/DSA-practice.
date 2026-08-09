class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        int cursum=0;
        int ans=0;
        for(int num:nums){
            cursum+=num;
            int req=cursum-k;
            if(map.containsKey(req)){
                ans+=map.get(req);
            }
            map.put(cursum,map.getOrDefault(cursum,0)+1);
        }
        return ans;
    }
}