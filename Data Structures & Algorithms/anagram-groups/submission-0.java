class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            int[] fr = new int[26];
            for (char c : s.toCharArray()) {
                fr[c - 'a']++;
            }
            String k = Arrays.toString(fr);
            List<String> group = map.getOrDefault(k, new ArrayList<>());
            group.add(s);
            map.put(k, group);
        }
        for (List<String> s : map.values()) {
            ans.add(s);
        }
        return ans;
    }
}
