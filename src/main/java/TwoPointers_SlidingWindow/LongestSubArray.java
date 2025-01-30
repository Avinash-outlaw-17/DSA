package TwoPointers_SlidingWindow;

public class
LongestSubArray {
    public static void main(String[] args) {
int nums[] = {2,5,1,7,10};
int k = 14;
int res = longest(nums,k);
        System.out.println(res);
    }

    public static int longest(int[]nums, int k){
        int l =0, r=0, sum =0,maxlen =0;
        while(r< nums.length){
            sum = sum+nums[r];
            while (sum>k){
                sum = sum-nums[l];
                l=l+1;
            }
            if(sum<=k){
                maxlen = Math.max(maxlen,r-l+1);
                r=r+1;
            }
        }
        return maxlen;
    }
}
