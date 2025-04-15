package Arrays;

import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majority2(nums));
    }

    //Brute
    public static int majority(int[] nums) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        int res = 0;
        int majority = 0;
        for (int i : nums) {
            hash.put(i, hash.getOrDefault(i, 0) + 1);
            if (hash.get(i) > majority) {
                res = i;
                majority = hash.get(i);
            }
        }
        return res;
    }

    //Brute
    public static int majority1(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (nums[j] == nums[i]) {
                    cnt++;
                }
            }
            if (cnt > (n / 2))
                return nums[i];
        }

        return -1;
    }

    //Moore's voting
    public static int majority2(int[] nums) {
        int n = nums.length;
        int majority = nums[0];
        int votes = 1;
        for (int i = 0; i < n; i++) {
            if (votes == 0) {
                votes++;
                majority = nums[i];
            } else if (majority == nums[i]) {
                votes++;
            } else votes--;
        }
        return majority;
    }
}
