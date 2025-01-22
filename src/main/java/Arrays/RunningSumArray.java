package Arrays;

import java.util.Arrays;

public class RunningSumArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] sum = runningsum2(nums);
        System.out.println(Arrays.toString(sum));
    }
    public static int[] runningsum(int[] nums){
        //Brute Force
        for (int i = 1; i < nums.length ; i++) {
            nums[i] = nums[i-1]+nums[i];
        }
        return nums;
    }

    public static int[] runningsum2(int[] nums){
        //Another method Dp
        int[] sum = new int[nums.length];
        if(nums.length==0)
            return sum;
         sum[0]= nums[0];
        for (int i = 1; i < nums.length ; i++) {
            sum[i] = sum[i-1]+nums[i];
        }
        return sum;
    }
}
