package basics.maths;

import java.util.ArrayList;

public class AllDivisor {

    public static ArrayList<Integer> printDiv(int num) {
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                ans.add(i);
                if (i != num / i) {
                    ans.add(num / i);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> myans = printDiv(36);

        for (int i = 0; i < myans.size(); i++) {
            System.out.print(myans.get(i) + " ");
        }
    }
}
