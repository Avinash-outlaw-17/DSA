package TwoPointers_SlidingWindow;

public class MaxSumFromCards {
    public static void main(String[] args) {
        int[] nums ={6,2,3,4,7,2,1,7,1};
        int k=4;
        int res = maxSum(nums,k);
        System.out.println(res);
    }
    public static int maxSum(int[] cards, int k) {
        int n = cards.length;

        // Step 1: Calculate the sum of the last 'k' cards
        int currentSum = 0;
        for (int i = n - k; i < n; i++) {
            currentSum += cards[i];
        }

        // Step 2: Initialize the maximum sum as the sum of the last 'k' cards
        int maxSum = currentSum;

        // Step 3: Slide the window from the end of the array towards the start
        for (int i = 0; i < k; i++) {
            currentSum = currentSum - cards[n - k + i] + cards[i];
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
