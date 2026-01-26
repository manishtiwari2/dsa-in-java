package Arrays.medium;
import java.util.HashMap;

public class MajorityElement {
    public int majorityElement(int[] nums){
        int check = 0;
        int majNum = 0;

        for (int num : nums) {
            if (check == 0) {
                majNum = num;
            }
            if (num == majNum) {
                check++;
            } else {
                check--;
            }
        }
        return majNum;
    }
    public static void main(String[] args) {
        MajorityElement obj = new MajorityElement();
        int[] nums = {2, 2, 1, 1, 1, 2,1};
        int result = obj.majorityElement(nums);
        System.out.println("Majority Element: " + result);
    }
}

// Approach used : -- > MOORE VOTING ALGORITHM

//Majority Guarantee: One element occurs more than half of the array size.
//Candidate Selection: Maintain a current candidate and a balance counter.
//Cancellation Principle: Different elements cancel each other’s count.
//Survival Rule: The true majority element cannot be cancelled and remains at the end.


// HashMap - frequency count algorithm (Naive Approach)

//public int majorityElement(int[] nums) {
//    int max = nums.length / 2;
//    HashMap<Integer, Integer> map = new HashMap<>();
//    // Count frequency
//    for (int num : nums) {
//        map.put(num, map.getOrDefault(num, 0) + 1);
//    }
//    int maxNum = 0;
//    int freq = -1;
//    // Find element with highest frequency
//    for (int key : map.keySet()) {
//        if (map.get(key) > freq) {
//            freq = map.get(key);
//            maxNum = key;
//        }
//    } if (freq > max) {
//        return maxNum;
//    }
//    return -1;
//}