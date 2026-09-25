class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String lowcase= paragraph.toLowerCase();
        //to ignore punctuation we split using regex. removes comma and fullstops etc
        String[]words= lowcase.split("[^a-z]+");
        HashSet<String>set=new HashSet<>();
        for(String b:banned){
            set.add(b);
        }
        HashMap<String, Integer>map=new HashMap<>();
        for(String word: words){
            if(!set.contains(word)){
                map.put(word,map.getOrDefault(word,0)+1);
            }
        }
        String ans="";
        int max=0;
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            if(entry.getValue()>max){
                max=entry.getValue();
                ans=entry.getKey();
            }
        }
        return ans;


    }
}