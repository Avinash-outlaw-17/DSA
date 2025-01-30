package TwoPointers_SlidingWindow;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
int [] nums ={1,1,1,0,0,0,1,1,1,1,0};
int k =2;
        System.out.println(maxCon(nums,k));
    }
    public static int maxCon(int[] nums, int k){
        int start=0,max=0,zerocount=0;
        for (int end = 0; end < nums.length ; end++) {
            if(nums[end]==0){
                zerocount++;
            }
            while (zerocount>k){
                if(nums[start]==0){
                    zerocount--;
                }
                start++;
            }
            max = Math.max(max,end-start+1);
        }
        return max;
    }
}
