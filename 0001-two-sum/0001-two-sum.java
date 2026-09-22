class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> found=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int req=target-nums[i];
            if(found.containsKey(req)) return new int[] {found.get(req),i};
            else found.put(nums[i],i);
        }
        return new int[] {-1,-1};
        }
}