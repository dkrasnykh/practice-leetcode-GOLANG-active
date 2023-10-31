package arrays_hashing.jewels_and_stones_771;

import java.util.Set;
import java.util.HashSet;

public class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> set = new HashSet<>();
        for(int i= 0; i < jewels.length(); ++i){
            set.add(jewels.charAt(i));
        }
        int result = 0;
        for(int i = 0; i < stones.length(); ++i){
            if(set.contains(stones.charAt(i))){
                result += 1;
            }
        }
        return result;
    }
}
