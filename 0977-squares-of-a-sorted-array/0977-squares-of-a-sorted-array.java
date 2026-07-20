class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int []temp=new int[n];
        int l=0;
        int r=n-1;
        int pos=n-1;
        while(l<=r){
            if(nums[l]*nums[l]>nums[r]*nums[r]){
                temp[pos]=nums[l]*nums[l];
                l++;
                pos--;
            }
            else{
                temp[pos]=nums[r]*nums[r];
                r--;
                pos--;
            }
        }
        return temp;
    }
}