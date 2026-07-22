class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int[] ans=new int[n];
        int x=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=val){
                ans[x++]=nums[i];
            }
        }
        for(int i=0;i<x;i++){
            nums[i]=ans[i];
        }
        return x;
    }
}