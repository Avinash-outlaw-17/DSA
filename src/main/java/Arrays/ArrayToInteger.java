package Arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayToInteger {
    public static void main(String[] args) {
int[] nums={1,2,0,0};
int k = 34;
        System.out.println(addToArray(nums,k));
    }

    public static List<Integer> addToArray(int[] nums, int k){
        List<Integer> ans = new ArrayList<>();
        int sum=0;
        for (int num:nums){
            sum = num*10+num;
        }
        sum = sum+k;
        while (sum>0){
            ans.add(ans.get(sum/10));
        }
        return ans;

    }
}
