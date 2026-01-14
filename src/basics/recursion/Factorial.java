package basics.recursion;

public class Factorial {
    public int findFact(int n){
        if(n == 0){
            return 1;
        }
        return n*findFact(n-1);
    }

    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println(f.findFact(5));
    }
}
