class Solution {
    public char findTheDifference(String s, String t) {
        
        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        for(int i = 0; i<t.length(); i++){
            char c = t.charAt(i);
            if(!map.containsKey(c)){
                return c;
            }
            map.put(c, map.get(c)-1);
            if(map.get(c)<0){
                return c;
            }
        }
        return ' ';
    }
}