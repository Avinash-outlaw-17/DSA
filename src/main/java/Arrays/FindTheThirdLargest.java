package Arrays;

public class FindTheThirdLargest {
    public static void main(String[] args) {
int nums[] ={5,2,9,7,8,12,15};
int res = thirdLargest(nums);
        System.out.println(res);
    }
    public static int thirdLargest(int[] nums){
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;
        for (int num : nums) {
            if(num>first){
                third = second;
                second=first;
                first=num;
            } else if (num>second) {
                third=second;
                second= num;
            } else if (num>third) {
                third = num;
            }

        }
        return third;
    }
}
