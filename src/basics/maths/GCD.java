package basics.maths;

public class GCD {

    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    public static void main(String[] args){
        GCD g = new GCD();
        System.out.println(g.gcd(36,9));
    }
}
