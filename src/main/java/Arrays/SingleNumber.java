package Arrays;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static void main(String[] args) {
int[] nums={1,1,2,3,3,4,4};
        System.out.println(Unique(nums));
    }

    public static int Unique(int[]nums){
        int n = nums.length;
        for (int i=0;i<n;i++) {
            int num = nums[i];
            int count=0;
            for (int j = 0; j < n; j++) {
                if ( num==nums[j]){
                    count++;
                }
            }
            if(count==1){
                return num;
            }
        }
        return -1;

    }

    //Optimal way (XOR operations)
    public static int SingleOptimal(int[]nums){
        int xor =0;
        for (int i = 0; i < nums.length ; i++) {
            xor =xor^nums[i];
        }
        return xor;
    }

    //Using HashMap
    public static int SingleOptimal2(int[]nums){
        HashMap<Integer,Integer> hash = new HashMap<>();
        for (int num:nums){
            hash.put(num, hash.getOrDefault(num,0)+1);
        }

        for (Map.Entry<Integer,Integer> it: hash.entrySet()){
            if(it.getValue()==1){
                return it.getKey();
            }
        }
        return -1;
    }

}
