package basics.recursion;

public class UptoN {

    public void printUpTON(int n){
        if(n == 0){
            return;
        }

        printUpTON(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        UptoN s = new UptoN();
        s.printUpTON(5);
    }
}

