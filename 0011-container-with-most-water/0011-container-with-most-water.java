class Solution {
    public int maxArea(int[] height) {
        int MaximumAreaAchieved = 0;
        int LeftPointer = 0;
        int RightPointer = height.length-1;

        while(LeftPointer < RightPointer){
            int Length = Math.min(height[LeftPointer] , height[RightPointer]);
            int Width = RightPointer - LeftPointer;
            int CurrentArea = Length * Width;
            MaximumAreaAchieved = Math.max(MaximumAreaAchieved,CurrentArea);

            if(height[LeftPointer] <= height[RightPointer]) ++LeftPointer;
            else                                            --RightPointer;
        }
        return MaximumAreaAchieved;
    }
}