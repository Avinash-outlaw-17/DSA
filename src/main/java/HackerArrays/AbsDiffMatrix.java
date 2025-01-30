package HackerArrays;

import java.util.ArrayList;
import java.util.List;

public class AbsDiffMatrix {
    public static void main(String[] args) {
List<List<Integer>> arr = List.of(List.of(1,2,3),List.of(4,5,6),List.of(9,8,9));
int diff = diagonalDiff(arr);
        System.out.println(diff);

    }
    public static int diagonalDiff(List<List<Integer>> arr){
        int sum1 = 0;
        int sum2=0;
        int n= arr.size();
        for (int i = 0; i <n ; i++) {
            sum1 += arr.get(i).get(i);
            sum2 += arr.get(i).get(n-i-1);
        }
        return Math.abs(sum1-sum2);

    }
}
