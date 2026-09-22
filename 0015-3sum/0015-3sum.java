class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> triplet=new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int num2=i+1,num3=nums.length-1;
            while(num3>num2){
            int sum=nums[i]+nums[num2]+nums[num3];
            if(sum==0) {
                triplet.add(Arrays.asList(nums[i],nums[num2],nums[num3]));
                num2++;
                num3--;
            } 
            else if(sum<0) num2++;
            else num3--;
            }
        }
        return new ArrayList<>(triplet);
    }
}