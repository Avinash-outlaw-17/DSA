package HashMaps_Sets;

import java.util.HashSet;
import java.util.Set;

public class MakeArrayZero {
    //https://leetcode.com/problems/make-array-zero-by-subtracting-equal-amounts/description/
    public static void main(String[] args) {
int[] nums ={1,5,0,3,5};
int ans =minimumOperations(nums);
        System.out.println(ans);
    }
    public static int minimumOperations(int[]nums){

        Set<Integer> set = new HashSet<>();
        for (int a:nums)
            if (a > 0) {
                set.add(a);
            }
        return set.size();
    }
}
