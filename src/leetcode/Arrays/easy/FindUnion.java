package leetcode.Arrays.easy;
import java.util.ArrayList;
import java.util.List;

public class FindUnion {
    public List<Integer> findUnion(int[] nums1, int[] nums2) {
        List<Integer> union = new ArrayList<>();
        int i = 0, j = 0;
        int m = nums1.length, n = nums2.length;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                addIfNotDuplicate(union, nums1[i]);
                i++;
            }
            else if (nums2[j] < nums1[i]) {
                addIfNotDuplicate(union, nums2[j]);
                j++;
            }
            else {
                addIfNotDuplicate(union, nums1[i]);
                i++;
                j++;
            }
        }
        while (i < m) {
            addIfNotDuplicate(union, nums1[i]);
            i++;
        }
        while (j < n) {
            addIfNotDuplicate(union, nums2[j]);
            j++;
        }
        return union;
    }
    private void addIfNotDuplicate(List<Integer> list, int val) {
        if (list.isEmpty() || list.get(list.size() - 1) != val) {
            list.add(val);
        }
    }

    public static void main(String[] args) {
        FindUnion obj = new FindUnion();

        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {3, 4, 5, 6, 7};

        List<Integer> result = obj.findUnion(nums1, nums2);
        System.out.println("Union of arrays: " + result);
    }
}

// Using map

//public List findUnion(int[] nums1, int[] nums2){
//    int m = nums1.length;
//    int n = nums2.length;
//    TreeMap<Integer,Integer> map = new TreeMap<>();
//
//    for(int i = 0; i < n; i++){
//        map.put(nums1[i], map.getOrDefault(nums1[i],0) + 1);
//    }
//    for(int i = 0; i < n; i++){
//        map.put(nums2[i], map.getOrDefault(nums2[i],0) + 1);
//    }
//    List<Integer> union = new ArrayList<>();
//    for(int key: map.keySet()){
//        union.add(key);
//    }
//    return union;
//}



// Using Set

//public List findUnion(int[] nums1, int[] nums2){
//    Set<Integer> set = new TreeSet<>();
//    for(int num: nums1){
//        set.add(num);
//    }
//    for(int num: nums2){
//        set.add(num);
//    }
//    return new ArrayList<>(set);
//}