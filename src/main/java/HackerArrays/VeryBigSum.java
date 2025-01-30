package HackerArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class VeryBigSum {
    public static void main(String[] args) {
ArrayList<Long> arr = new ArrayList<>();
arr.add(1000000001L);
arr.add(1000000002L);
arr.add(1000000003L);
arr.add(1000000004L);
arr.add(1000000005L);
    long result = veryBig(arr);
        System.out.println(result);
    }

    public static long veryBig(List<Long> arr){
        long result = 0;
        for (int i = 0; i <arr.size(); i++) {
            result=  result+arr.get(i);
        }
        return result;
    }
}
