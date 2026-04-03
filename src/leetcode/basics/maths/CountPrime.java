package leetcode.basics.maths;

public class CountPrime {
    public int countPrime(int num){
        int ans = 0;
        boolean[] isPrime = new boolean[num];
        for(int i = 2;i<num;i++){
            isPrime[i] = true;
        }

        for(int i = 2;i*i < num; i++){
            if(isPrime[i]){
                for(int j = i*i;j < num;j+=i){
                    isPrime[j] = false;
                }
            }
        }
        for(int i = 2;i<num;i++){
            if(isPrime[i]){
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        CountPrime cp = new CountPrime();
        System.out.println(cp.countPrime(10));
    }
}
