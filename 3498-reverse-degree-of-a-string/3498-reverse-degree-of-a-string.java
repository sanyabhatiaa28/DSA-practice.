class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int revval=26-(c-'a');
            int pos=i+1;
            sum+=revval*pos;

        }
        return sum;
    }
}