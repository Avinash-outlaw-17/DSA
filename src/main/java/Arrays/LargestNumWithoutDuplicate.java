package Arrays;

import java.util.HashMap;

public class LargestNumWithoutDuplicate {
    public static void main(String[] args) {
        int nums[] = {4,3,2,7,3,4,8,8};
        int large = largest(nums);
        System.out.println(large);
    }
    public static int largest(int[]nums) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        for (int i :nums) {
            hs.put(i, hs.getOrDefault(i,0)+1);
        }
        int large =0;
        for (int i : hs.keySet()) {
            if(hs.get(i)==1){
                large = Math.max(large,i);
            }

        }
        if(large==Integer.MIN_VALUE){
            return -1;
        }
        return large;
    }
}
