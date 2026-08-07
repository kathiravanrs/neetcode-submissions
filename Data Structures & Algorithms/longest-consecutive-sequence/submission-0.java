class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int ans = 0;
        for(int i:nums)set.add(i);
        for(int i:set){
            if(set.contains(i-1)) continue;
            else{
                int cur = 1;
                int next = i+1;
                while(set.contains(next)){
                    cur++;
                    next++;
                }
                ans = Math.max(ans, cur);
            }
        }
        return ans;
    }
}
