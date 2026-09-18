class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int num1=0,num2=numbers.length-1,sum=0;
        while(num1<num2){
        sum=numbers[num1]+numbers[num2];
        if(sum==target) return new int[]{num1+1,num2+1};
        else if(sum>target) num2--;
        else num1++;
        }
        return new int[]{-1,-1};
    }
}