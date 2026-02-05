package basics.recursion;

public class Simple {
    public void printName(int n){
        if(n == 0){
            return;
        }
        System.out.println("Manish Tiwari");
        printName(n-1);
    }

    public static void main(String[] args) {
        Simple s = new Simple();
        s.printName(5);
    }
}
