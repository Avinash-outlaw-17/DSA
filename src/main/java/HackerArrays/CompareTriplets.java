package HackerArrays;

import java.util.ArrayList;
import java.util.List;

public class CompareTriplets {
    public static void main(String[] args) {
List<Integer> a = new ArrayList<>();
List<Integer> b = new ArrayList<>();
a.add(1);
a.add(2);
a.add(3);
b.add(3);
b.add(2);
b.add(1);
List<Integer> result = compareTriplets(a,b);
        System.out.println(result);


    }
    public static List<Integer> compareTriplets(List<Integer> a,List<Integer> b) {
        List<Integer> result = new ArrayList<>();
        int bob= 0;
        int alice=0;
        int size = Math.min(a.size(),b.size());
        for (int i = 0; i <size ; i++) {
            if(a.get(i)>b.get(i)){
                alice= alice+1;
            } else if (a.get(i)<b.get(i)) {
                bob =bob+1;
            }

        }
        result.add(alice);
        result.add(bob);
        return result;
    }

}
