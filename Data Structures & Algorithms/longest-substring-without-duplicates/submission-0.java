class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        Set<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                ans = Math.max(ans, set.size());
                set.clear();
            }
            else{
                set.add(s.charAt(i));
            }
        }
        return Math.max(ans, set.size());
    }
}
