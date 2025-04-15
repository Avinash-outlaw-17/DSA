package Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] nums ={1,0,2,0,13};

        //System.out.println(Movezero(nums));

    }

    public static void Movezero(int[] nums){
        int j=0;
        for (int i = 0; i < nums.length ; i++) {
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                j++;
            }
        }
        //return nums;
    }
}
