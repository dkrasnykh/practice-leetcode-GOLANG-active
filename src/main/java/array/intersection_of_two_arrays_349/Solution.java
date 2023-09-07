package array.intersection_of_two_arrays_349;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for(int i = 0; i < nums1.length; ++i){
            set1.add(nums1[i]);
        }
        Set<Integer> set2 = new HashSet<>();
        for(int i = 0; i < nums2.length; ++i){
            set2.add(nums2[i]);
        }
        set1.retainAll(set2);
        int[] result = new int[set1.size()];
        int i = 0;
        for(Integer e: set1){
            result[i] = e;
            i += 1;
        }
        return result;
    }
}
