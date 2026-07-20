class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;
        int bestans=nums[0]+nums[1]+nums[2];
        for(int i=0;i<n-2;i++){
            int comple=nums[i];
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=comple+nums[j]+nums[k];
                if(Math.abs(target-sum)<Math.abs(target-bestans)){
                    bestans=sum;
                }
                if(sum==target)return target;
                else if(sum>target)k--;
                else j++;
            }
        }
        return bestans;
    }
}