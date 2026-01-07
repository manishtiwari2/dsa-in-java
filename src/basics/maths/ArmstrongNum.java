package basics.maths;

public class ArmstrongNum {

    public boolean isArmStrong(int num) {
        if (num < 0) return false;

        int original = num;
        int length = String.valueOf(num).length(); // simple digit count
        int sum = 0;

        while (num > 0) {
            int last = num % 10;
            sum += Math.pow(last, length);
            num /= 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {
        ArmstrongNum arm = new ArmstrongNum();
        System.out.println(arm.isArmStrong(153)); // true
        System.out.println(arm.isArmStrong(370)); // true
        System.out.println(arm.isArmStrong(123)); // false
    }
}


//public class ArmstrongNum {
//
//    public boolean isArmStrong(int num) {
//        int ans = num;
//
//        // count digits
//        int length = 0;
//        int dupli = num;
//        while (dupli > 0) {
//            length++;
//            dupli /= 10;
//        }
//
//        int sum = 0;
//        while (num > 0) {
//            int last = num % 10;
//
//            int digit = 1;   // 🔥 FIXED
//            for (int i = 0; i < length; i++) {
//                digit = digit * last;
//            }
//
//            sum += digit;
//            num /= 10;
//        }
//        return sum == ans;
//    }
//
//    public static void main(String[] args) {
//        ArmstrongNum arm = new ArmstrongNum();
//        System.out.println(arm.isArmStrong(153)); // true
//    }
//}
