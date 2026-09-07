class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int highestCount=0;
        int majorityElement=nums[0];
        for(int element:map.keySet()){
           if(map.get(element)>highestCount){
            highestCount=map.get(element);
            majorityElement=element;
           }
        }
        return majorityElement;
    }
}