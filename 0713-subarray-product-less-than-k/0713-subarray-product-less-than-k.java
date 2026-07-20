class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n=nums.length;
        int l=0,r=0;
        int cnt=0;
        for(int i=0;i<n;i++){
            int prod=1;
            for(int j=i;j<n;j++){
                prod*=nums[j];
                if(prod>=k) break;
                cnt++;
            }
        }
        return cnt;
    }
}