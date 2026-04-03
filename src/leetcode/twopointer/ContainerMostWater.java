package leetcode.twopointer;

import java.util.*;

public class ContainerMostWater {
    public int maxArea(int[] heights) {

        int n = heights.length;
        int area = 0;
        int i = 0;
        int j = n - 1;

        while (i < j) {
            int height = Math.min(heights[i], heights[j]);
            int width = j - i;

            int currArea = height * width;
            area = Math.max(area, currArea);

            if (heights[i] <= heights[j]) {
                i++;
            } else {
                j--;
            }
        }
        return area;
    }
    public static void main(String[] args) {

        ContainerMostWater sol = new ContainerMostWater();
        int[] heights = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int result = sol.maxArea(heights);
        System.out.println("Heights: " + Arrays.toString(heights));
        System.out.println("Maximum Water Container Area: " + result);
    }
}

