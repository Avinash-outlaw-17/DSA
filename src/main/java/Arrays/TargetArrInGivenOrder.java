package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class TargetArrInGivenOrder {
    public static void main(String[] args) {
        int[] nums ={0,1,2,3,4};
        int[] index ={0,1,2,2,1};
        int [] target = targetArray(nums,index);
        System.out.println(Arrays.toString(target));
    }
    public static int[] targetArray(int[]nums, int[] index){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length ; i++) {
            list.add(index[i],nums[i]);
        }
        int[] target = new int[list.size()];
        for (int i = 0; i < nums.length ; i++) {
            target[i]= list.get(i);
        }

        return target;
    }
}
