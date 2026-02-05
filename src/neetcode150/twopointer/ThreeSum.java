package neetcode150.twopointer;

import java.util.*;

public class ThreeSum {

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
        ThreeSum obj = new ThreeSum();
        int[] heights = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("Max Area: " + obj.maxArea(heights));
    }
}

