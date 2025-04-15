package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class RearrangeBySigns {
    public static void main(String[] args) {
int[] nums={1,2,-4,-5};
        System.out.println(Arrays.toString(rearrange2(nums)));
    }

    public static int[] rearrange(int[]nums){
        int n = nums.length;
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            if(nums[i]>0) pos.add(nums[i]);
            else neg.add(nums[i]);}
        for (int i = 0; i <n/2 ; i++) {
            nums[2*i]=pos.get(i);
            nums[2*i+1]=neg.get(i);
        }
        return nums;
    }

    public static int[] rearrange2(int[]nums){
        int n= nums.length;
        int[] temp= new int[n];
        int pos=0, neg=1;
        for(int num: nums){
            if(num>0){
                temp[pos]=num;
                pos+=2;
            }else {temp[neg]=num;
                neg+=2;}
        }
        return temp;

    }
}
