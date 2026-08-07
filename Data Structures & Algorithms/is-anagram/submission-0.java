class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for(Character c: s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        for(Character c: t.toCharArray()){
            if(!map.containsKey(c)) return false;
            int val = map.get(c);
            if(val==1) map.remove(c);
            else map.put(c, val-1);
        }
        return map.isEmpty();
    }
}
