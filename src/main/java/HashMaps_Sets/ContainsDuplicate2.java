package HashMaps_Sets;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate2 {
    public static void main(String[] args) {
int[] nums={1,2,3,1,2,3};
int k =2;
boolean ans = containsDup(nums,k);
        System.out.println(ans);
}

public static boolean containsDup(int[]nums, int k) {
Map<Integer,Integer> seen = new HashMap<>();
    for (int i = 0; i < nums.length ; i++) {
        int val = nums[i];
        if(seen.containsKey(val)&& i- seen.get(val)<=k){
            return true;
        }
        seen.put(val,i);
    }
    return false;

}
}
