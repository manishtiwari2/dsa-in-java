package leetcode.Arrays.medium;

import java.util.*;

public class LeadersInArray {

    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;

        ans.add(arr[n - 1]);
        int curr = arr[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= curr) {
                ans.add(arr[i]);
                curr = arr[i];
            }
        }

        Collections.reverse(ans);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};

        ArrayList<Integer> result = leaders(arr);

        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}
