class Solution {
    public int findGCD(int[] nums) {
        int mn=1001;
        int mx=0;
        for(int num:nums){
            if(num<mn)mn=num;
            if(num>mx)mx=num;
        }
        return gcd(mn,mx);
    }
    private int gcd(int a,int b){
        while(b!=0){
            int temp=a%b;
            a=b;
            b=temp;
        }
        return a;
    }
}