package Arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        boolean res = containsDuplicate2(nums);
        System.out.println(res);

    }
/*
Brute Force
 */
    public static boolean containsDuplicate(int[]nums){
        int n = nums.length;
        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j <n; j++) {
                if(nums[i] == nums[j]){
                    return true;
                } 

            }

        }return false;

    }

    /*
    Optimised way using hash set
     */
    public static boolean containsDuplicate2(int[]nums) {

        // Create hashset to store integers
        //Sets do not allow duplicates
        Set<Integer> intSet = new HashSet<>();

        // Iterate over each element
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            // Check the number in hashset
            if (intSet.contains(num))
                return true;

            // if the number is not present Add the number to hashset
            intSet.add(num);
        }

        return false;
    }
}
