package TwoPointers_SlidingWindow;

public class MinSubarraySum {
    public static void main(String[] args) {
int [] nums={2,3,1,2,4,3};
int target =7;
        System.out.println(minSub(target,nums));
    }
    public static int minSub(int target, int[]nums){
int minLen = Integer.MAX_VALUE;
int currentSum =0;
int low =0;
        for (int high = 0; high < nums.length; high++) {
            currentSum += nums[high]; // Add current number to the window

            // Shrink the window while the sum is greater than or equal to the target
            while (currentSum >= target) {
                int currentWindowSize = high - low + 1; // Calculate the window size (inclusive of high)
                minLen = Math.min(minLen, currentWindowSize); // Update minLen with the smaller window size
                currentSum -= nums[low]; // Shrink the window from the left
                low++; // Move the left pointer
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;

    }
}
