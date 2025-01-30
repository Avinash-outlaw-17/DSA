package TwoPointers_SlidingWindow;

public class MaximumAverageSum {
    public static void main(String[] args) {
int [] nums = {1,12,-5,-6,50,3};
int k = 4;
double max = maxsum(nums,k);
        System.out.println(max);
    }
    public static double maxsum(int[]nums,int k){
        int sum=0;
        int max=0;
        for (int i = 0; i <k ; i++) {
            sum +=nums[i];
            max = sum;
        }
        int start =0,end=k;
        while (end<nums.length){
            //Remove the 1st element value
            sum=sum-nums[start];
            start++; //increment the start point to next index;
            //Add the end+1 index value
            sum+=nums[end];
            end++; //icrement the end index
            max = Math.max(max,sum);
        }
        return (double) max/k;
    }
}
