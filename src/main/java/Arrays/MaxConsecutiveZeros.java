package Arrays;

public class MaxConsecutiveZeros {
    public static void main(String[] args) {
int[] nums ={1,1,1,1,0,0,0,1,1,1,1,1,1};
        System.out.println(maxOne(nums));
    }

    public static int maxOne(int[] nums){
        int n = nums.length;
        int max=0;
        int count=0;
        for (int i = 0; i <n ; i++) {
            if(nums[i]==1){
                count++;
                max= Math.max(count,max);
            }else {
                count=0;
            }
        }
        return max;
    }
}
