class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0;
        int left = 0;
        int right = heights.length - 1;

        while (left < right) {
            int length = right - left;
            int height = Math.min(heights[left], heights[right]);
            int area = length * height;

            if(area > maxArea) {
                maxArea = area;
            }

            if (heights[left] > heights[right]) {
                right--;
            } else {
                left++;
            }
        }
        return maxArea;
    }
}
