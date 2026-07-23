class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length, l=0, sum=0, maxsum=Integer.MIN_VALUE;
        for(int r=0;r<n;r++){
            sum+=nums[r];
            if(r-l+1==k){
                maxsum=Math.max(maxsum,sum);
                sum-=nums[l];
                l++;
            }
        }
        return (double) maxsum/k;
    }
}