class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int max = 0;
        for(int num : nums){
            max = Math.max(max,num);
        }
        max <<= 1;
        boolean[] pair = new boolean[max];

        for(int n1 : nums){
            for(int n2 : nums){
                pair[n1^n2] = true;
            }
        }
        boolean[] ans = new boolean[max];

        for(int num = 0; num<max; num++){
            if(!pair[num]) {
                continue;
            }
            for(int c : nums){
                ans[num^c] = true;
            }
        }
        int res = 0;
        for(boolean b : ans){
            if(b){
                res++;
            }
        }
        return res;
    }
}
