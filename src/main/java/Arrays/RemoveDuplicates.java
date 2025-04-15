package Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
int nums[] = {1,1,2};
        System.out.println(removeDup(nums));
    }

    public static int removeDup(int[] nums){
        if (nums.length == 0) return 0;

        int i = 1;

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i - 1]) {
                nums[i] = nums[j];
                i++;
            }
        }

        return i;
    }
}
