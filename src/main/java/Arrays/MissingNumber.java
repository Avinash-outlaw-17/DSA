package Arrays;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums ={0,1,3};
        System.out.println(missinNum(nums));
    }

    public static int missinNum(int[]nums){
        int n = nums.length;

        Arrays.sort(nums);
        if(nums[0]!=0) return 0;

        if(nums[n-1]!=n) return n;
        for (int i = 1; i <n ; i++) {
            if(nums[i]!=i){
                return i;
            }
        }
        return 0;
    }
}
