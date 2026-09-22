class Solution {
    public int maxArea(int[] height) {
        int maxArea=0;
        int height1=0,height2=height.length-1;
        for(int i=height1;i<height.length;i++){
        int area=Math.min(height[height1],height[height2])*(height2-height1);
        maxArea=Math.max(maxArea,area);
        if(height[height1]>height[height2]) height2--;
        else height1++;
        }
        return maxArea;
    }
    
}