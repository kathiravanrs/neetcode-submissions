class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n= nums.length;
        for(int i=0;i<n-2;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int target = 0 - nums[i];
            int l = i+1;
            int r = n-1;
            while(l<r){
                int total = nums[l]+nums[r];
                if(total<target) l++;
                else if(total>target) r--;
                else {
                    ans.add(new ArrayList<>(Arrays.asList(nums[i], nums[l], nums[r])));
                    while(l<r && nums[l]==nums[l+1]) l++;
                    while(l<r && nums[r]==nums[r-1]) r--;
                    l++;
                    r--;
                }
            }
        }
        return ans;
    }
}
