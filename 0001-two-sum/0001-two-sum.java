class Solution {
    public int[] twoSum(int[] nums, int target) {
    Map<Integer,Integer> a=new HashMap<>();
       for(int i=0;i<nums.length;i++){
        int required=target-nums[i];
        if(a.containsKey(required)){
            return new int[] {a.get(required),i};
        }
        else{
            a.put(nums[i],i);
        }
       }
       return new int[] {-1,-1};
    }
}