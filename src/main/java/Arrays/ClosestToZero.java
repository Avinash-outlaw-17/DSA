package Arrays;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;
import static java.lang.Math.abs;
import static java.lang.Math.max;

public class ClosestToZero {
    public static void main(String[] args) {
int nums[] = {-4,-2,1,4,8};
int val = findclosest(nums);
        System.out.println(val);

    }

    public static int findclosest(int[] nums){
        int min = Integer.MAX_VALUE;
        int ans = Integer.MIN_VALUE;

        for (int n : nums) {
            if (abs(n) < min) {
                min = abs(n);
                ans = n;
            } else if (abs(n) == min) {
                ans = max(ans, n);
            }
        }

        return ans;
    }
}
