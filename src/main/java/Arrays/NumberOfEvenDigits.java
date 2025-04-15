package Arrays;

public class NumberOfEvenDigits {
    public static void main(String[] args) {
        int[] nums={12,345,2,6,7896};
        System.out.println(isEven(nums));
    }

    public static int isEven(int[]nums){
        int count=0;
        for (int num:nums) {
            if (isevencount(num)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isevencount(int num){
        int digits=0;
        while (num>0){
            num=num/10;
            digits++;
        }
        return digits%2==0;
    }
}
