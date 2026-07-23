class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        int l=0;
        int sum=0;
        double avg=0;
        double maxavg=Integer.MIN_VALUE;
        for(int r=0;r<n;r++){
            sum+=nums[r];
            if(r-l+1==k){
                avg=(double)sum/k;
                maxavg=Math.max(avg,maxavg);
                sum-=nums[l];
                l++;
            }
        }
        return maxavg;
    }
}