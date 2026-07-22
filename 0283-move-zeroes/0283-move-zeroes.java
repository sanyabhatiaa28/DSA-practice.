class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int i=0;
        while(i<n&&nums[i]!=0){
            i++;
        }
        int j=i+1;
        while(j<n){
            if(nums[j]!=0){
                //swap
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                while(i<n&&nums[i]!=0){
                    i++;
                }
            }
            else{
                j++;
            }
        }
    }
}