package Arrays;

import java.util.Arrays;

public class SmallerThanCurrentNumber {
    public static void main(String[] args) {
int[] nums = {8,1,2,2,3};
int[] ans = smallerNums(nums);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] smallerNums(int[]nums){
        int[] ans = new int[nums.length];
        int n = nums.length;


        for (int i = 0; i <n ; i++) {
            int count =0;
            for (int j = 0; j <n ; j++) {
                if(nums[i]>nums[j]){
                   count +=1;
                   ans[i]= count;
                }

            }

        }
        return ans;
    }
}
