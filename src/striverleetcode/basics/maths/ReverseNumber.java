package striverleetcode.basics.maths;

public class ReverseNumber {
    public int reverseNumber(int num){
        int revNum = 0;
        while(num>0){
           int last = num%10;
           revNum = revNum*10 + last;
           num = num/10;
        }
        return revNum;
    }

    public static void main(String[] args) {
        ReverseNumber revNum = new ReverseNumber();
        int ans = revNum.reverseNumber(123);
        System.out.println(ans);
    }
}
// 0
// 16=  6 === rever*10 + 6 == 10