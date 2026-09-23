class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum=nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length;i++){
        int num1Index=i+1,num2Index=nums.length-1;
        while(num2Index>num1Index){
            int sum=nums[i]+nums[num1Index]+nums[num2Index];
            if(Math.abs(sum-target)<Math.abs(closestSum-target)) closestSum=sum;
            else if(sum==target) return sum;
            else if(sum<target) num1Index++;
            else num2Index--; 
            
        }
        }
        return closestSum;
    }
}