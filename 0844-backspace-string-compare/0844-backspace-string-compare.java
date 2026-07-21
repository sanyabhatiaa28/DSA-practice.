class Solution {
    public boolean backspaceCompare(String s, String t) {
        int i=s.length()-1;
        int j=t.length()-1;
        int cnt1=0;
        int cnt2=0;
        while(i>=0||j>=0){
            while(i>=0){
                if(s.charAt(i)=='#'){
                    cnt1++;
                    i--;
                }
                else if(cnt1>0){
                    cnt1--;
                    i--;
                }
                else{
                    break;
                }
            }
            while(j>=0){
                if(t.charAt(j)=='#'){
                    cnt2++;
                    j--;
                }
                else if(cnt2>0){
                    cnt2--;
                    j--;
                }
                else{
                    break;
                }
            }
            if(i>=0&&j>=0){
                if(s.charAt(i)!=t.charAt(j)){
                    return false;
                }
            }
            else if(i>=0||j>=0){
                return false;
            }
            i--;
            j--;
        }
        return true;
    }
}