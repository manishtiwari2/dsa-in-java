package Arrays.medium;

public class MajorityElement {
}

//
//public int majorityElement(int[] nums) {
//    int max = nums.length/2;
//    HashMap<Integer,Integer> map = new HashMap<>();
//    for(int num: nums){
//        if(map.containsKey(num)){
//            map.put(num,map.get(num) + 1);
//        } else {
//            map.put(num, 1);
//        }
//    }

//    int maxNum = 0;
//    int freq = -1;
//    for(int key: map.keySet()){
//        if(map.get(key) > freq){
//            freq = map.get(key);
//            maxNum = key;
//        }
//    }
//    if(freq > max){
//        return maxNum;
//    }
//    return -1;
//}