package Arrays.easy;

public class LinearSearch {
    public int linearSearch(int[] nums, int target){
        for(int i = 0;i < nums.length; i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        LinearSearch ls = new LinearSearch();
        int[] nums = new int[]{8,1,2,3,4};
        System.out.println(ls.linearSearch(nums,5));
    }
}
