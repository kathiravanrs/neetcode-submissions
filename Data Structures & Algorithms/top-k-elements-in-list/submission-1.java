class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numberToCount = new HashMap<>();
        for(int i:nums){
            numberToCount.put(i, numberToCount.getOrDefault(i, 0) + 1);
        }

        Map<Integer, List<Integer>> countToNumbers = new HashMap<>();
        for(int i:numberToCount.keySet()){
            int freq = numberToCount.get(i);
            List<Integer> l = countToNumbers.getOrDefault(freq, new ArrayList<>());
            l.add(i);
            countToNumbers.put(freq,l);
        }

        int[] ans = new int[k];
        List<Integer> topF = new ArrayList<>(countToNumbers.keySet());
        Collections.sort(topF, Collections.reverseOrder());
        int count=0;
        for(int i:topF){
            List<Integer> vals = countToNumbers.get(i);
            for(int n:vals){
                ans[count] = n;
                count++;
                if(count==k) return ans;
            }
        }
        return ans;
    }
}
