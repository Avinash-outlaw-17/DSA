package HackerArrays;

import java.util.ArrayList;
import java.util.List;

public class RatiosOfArr {
    public static void main(String[] args) {
        List<Integer> arr = List.of(1,1,0,-1,-1);
        plusMinus(arr);
    }
    public static void plusMinus(List<Integer> arr){
        int positive =0;
        int negative=0;
        int zero=0;
        int total=arr.size();
        for (int i = 0; i <arr.size() ; i++) {
            if(arr.get(i)>0){
                positive++;
            } else if (arr.get(i)<0) {
                negative++;
            }else {
                zero++;
            }

        }
        double positiveRatio = (double) positive/total;
        double negativeRatio = (double) negative/total;
        double zeroRatio = (double) zero/total;
        System.out.printf("%.6f\n",positiveRatio);
        System.out.printf("%.6f\n",negativeRatio);
        System.out.printf("%.6f\n",zeroRatio);
    }

}
