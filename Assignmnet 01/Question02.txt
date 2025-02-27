package CSE220.Assignment01;

public class Question02 {
    public static void main(String[] args) {
    }
    public static int q02(int[] heights) {
        int maxArea = 0;
        int l = 0, r = heights.length - 1;
        while (l < r) {
            int width = r - l;
            int area;
            if (heights[l] <= heights[r]) {
                area = width * heights[l];
                l++;
            } else {
                area = width * heights[r];
                r--;
            }
            if (area > maxArea) {
                maxArea = area;
            }
        }
        return maxArea;
    }
}
