class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        Set<Character> set = new HashSet<>();
        int l=0;
        for(int i=0;i<s.length();i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(l));
                l++;
            }                
            set.add(s.charAt(i));
            ans = Math.max(ans, set.size());
        }
        return ans;
    }
}
