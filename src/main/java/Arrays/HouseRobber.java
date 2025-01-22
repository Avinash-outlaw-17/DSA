package Arrays;

public class HouseRobber {
    public static void main(String[] args) {
int[] nums = {2,7};
int rob = rob(nums);
        System.out.println(rob);
    }
    public static int rob(int[] nums){
        if(nums.length<2)
            return nums[0];

        //create an array to store max loot at each index
        int[] dp = new int[nums.length];
        //Add all the max loots at first 2 indexes
        dp[0]= nums[0];
        dp[1] = Math.max(nums[0],nums[1]);

        //Use the above to fill the dp array
        for (int i = 2; i < nums.length ; i++) {
            //Formula to max loot
            dp[i]= Math.max(dp[i-2]+nums[i],dp[i-1]);
        }
        return dp[nums.length-1];
    }

}
