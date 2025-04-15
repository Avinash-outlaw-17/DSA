package Arrays;

import java.util.Arrays;

public class Sort012 {
    public static void main(String[] args) {
int[] nums = {1,2,1,2,1,0,1,0,0,0,1,2};

System.out.println(Arrays.toString(sort1(nums)));
    }

    //Brute force
    public static int[] sort(int[]nums){
        int count0=0,count1=0,count2=0;
        for (int i = 0; i < nums.length ; i++) {
            if(nums[i]==0){
                count0++;
            } else if (nums[i]==1) {
                count1++;
            }else count2++;
        }
        for (int i = 0; i <count0 ; i++) {
            nums[i]=0;
        }
        for (int i = count0; i <count0+count1 ; i++) {
            nums[i]=1;
        }
        for (int i = count0+count1; i < nums.length ; i++) {
            nums[i]=2;
        }
        return nums;
    }

    //Optimal Dutch flag
    public static int[]sort1(int[]nums){
        int n= nums.length;
        int low=0;
        int mid=0;
        int high=n-1;
        while(mid<=high){
            if(nums[mid]==0){
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                low++;
                mid++;
            } else if (nums[mid]==1) {
                mid++;
            }else {
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;

            }
        }
        return nums;

    }
}
