class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer>set=new HashSet<>();
        while(n!=1){
            if(set.contains(n)){
                return false;
            }
            set.add(n);
            n=sumofsq(n);
        }
        return true;
    }
    private int sumofsq(int n){
        int sum=0;
        while(n>0){
            int dgt=n%10;
            sum+=dgt*dgt;
            n/=10;
        }
        return sum;
    }
}