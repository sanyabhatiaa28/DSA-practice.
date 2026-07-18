class Solution {
    public int commonFactors(int a, int b) {
        int smaller=a;
        int cnt=0;
        if(smaller<b)smaller=b;
        for(int i=1;i<=b;i++){
            if(a%i==0&&b%i==0){
                cnt++;
            }
        }
        return cnt;
    }
}