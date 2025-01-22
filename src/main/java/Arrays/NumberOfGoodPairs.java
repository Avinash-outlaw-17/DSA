package Arrays;

import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPairs {
    public static void main(String[] args) {

    }
    public static int goodpairs(int[] nums){
        int n = nums.length;
        Map<Integer,Integer> pairs = new HashMap<>();
        int count =0;
        for (int i = 0; i <n ; i++) {
            if(pairs.containsKey(nums[i])){
            count = count+pairs.get(nums[i]);
            }
            pairs.put(nums[i],pairs.getOrDefault(nums[i],0)+1 );

        }
        return count;
    }
}
