class Solution {
    public int firstUniqChar(String s) {
        char str[]=s.toCharArray();
        HashMap<Character,Integer>map=new HashMap<>();
        for(char c:str){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i=0;i<str.length;i++){
            if(map.get(str[i])==1){
                return i;
            }
        }
        return -1;
    }
}