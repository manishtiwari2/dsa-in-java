import java.util.Arrays;

class Solution {
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int[] preGCD = new int[n];

        int mx = 0;
        for (int i = 0; i < n; i++) {
            mx = Math.max(mx, nums[i]);
            preGCD[i] = gcd(nums[i], mx);
        }

        Arrays.sort(preGCD);

        long ans = 0;
        int left = 0, right = n - 1;

        while (left < right) {
            ans += gcd(preGCD[left], preGCD[right]);
            left++;
            right--;
        }

        return ans;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}