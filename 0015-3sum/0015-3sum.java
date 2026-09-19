class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> result=new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
           if(i>0 && nums[i]==nums[i-1]) continue;
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
            int sum=nums[i]+nums[j]+nums[k];
            if(sum==0){
                List<Integer> triplet=Arrays.asList(nums[i],nums[j],nums[k]);
                result.add(triplet);
                j++;
                k--;
            }
            else if(sum<0) j++;
            else k--;
            }
        }
        return new ArrayList<> (result);
    }
}