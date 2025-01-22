package Arrays;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
int[] nums = {2,5,1,3,4,7};
int n =3;
int [] res = shuffle(nums,n);
        System.out.println(Arrays.toString(res));

    }
    public static int[] shuffle(int[]nums, int n){
        int ans[] = new int[2*n];
        int count =0;
        for (int i = 0; i <n ; i++) {
            ans[count] = nums[i];
            ans[count+1]=nums[i+n];
            count = count+2;
        }
        return ans;
    }
}
