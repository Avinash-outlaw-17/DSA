package Arrays;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxKade(nums));
    }

    //Brute Force
    public static int maxSub(int[]nums){
        int n = nums.length;
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i <n ; i++) {
            int sum =0;
            for (int j = i; j <n ; j++) {
                sum+=nums[j];
                maxi = Math.max(sum,maxi);
            }
        }
        return maxi;
    }

    //Optimal Kadane's
    public static int maxKade(int[]nums){
        int n = nums.length;
        int maxi=Integer.MIN_VALUE;
        int sum=0;
        for (int i = 0; i <n ; i++) {
            sum+=nums[i];
            if(maxi<sum){
                maxi=sum;
            }
            if(sum<0){
                sum=0;
            }

        }
        return maxi;
    }
}
