package striverleetcode.basics.recursion;

public class SumN {
    public int sumN(int n){
        if(n == 0){
            return 0;
        }
        return n + sumN(n-1);
    }

    public static void main(String[] args) {
        SumN sm = new SumN();
        System.out.println(sm.sumN(5));
    }
}



