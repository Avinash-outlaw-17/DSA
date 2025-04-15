package Arrays;

import java.util.ArrayList;
import java.util.List;

public class LeadersInArray {
    public static void main(String[] args) {
        int nums[]=  {10, 22, 12, 3, 0, 6};
List<Integer> ans = superiorElements(nums);
        System.out.println(ans);
    }
    public static List< Integer > superiorElements(int []nums){
        int n= nums.length;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            boolean leader = true;
            for (int j = i+1; j <n ; j++) {
                if(nums[j]>nums[i]){
                    leader=false;
                    break;
                }
            }
            if (leader==true){
                ans.add(nums[i]);
            }
        }
        return ans;
    }
    //Brute force
    public static List<Integer> superiorElements2(int[]nums){
        ArrayList<Integer> ans = new ArrayList<>();
        int n= nums.length;
        int max= nums[n-1];
        ans.add(nums[n-1]);
        for (int i = n-2; i >=0 ; i--) {
            if(nums[i]>max){
                ans.add(nums[i]);
                max=nums[i];
            }
        }
        return ans;
    }
}
