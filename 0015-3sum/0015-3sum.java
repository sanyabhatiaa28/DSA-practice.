class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        List<List<Integer>>list=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
             if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            if(nums[i]>0){
                break;
            }
            int comp=nums[i];
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=comp+nums[j]+nums[k];
                if(sum>0){
                    k--;
                }
                else if(sum<0){
                    j++;
                }
                else{
                    List<Integer>triplets=new ArrayList<>();
                    triplets.add(comp);
                    triplets.add(nums[j]);
                    triplets.add(nums[k]);
                    j++;
                    k--;
                    list.add(triplets);
                    while(j<k&&nums[j]==nums[j-1]){
                        j++;
                    }
                    while(j<k&&nums[k]==nums[k+1]){
                        k--;
                    }
                }
            }
        }
        return list;
    }
}