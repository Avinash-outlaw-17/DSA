package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UnionOfSorted {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int b[] = {1, 2, 3, 6, 7};
        List<Integer> union = findUnion(a, b);
        System.out.println(union);

    }

    public static ArrayList<Integer> findUnion(int[]a,int[]b) {
        ArrayList<Integer> union = new ArrayList<>();
        int n = a.length;
        int m = b.length;
        Map<Integer,Integer> hash = new HashMap<>();
        for (int k = 0; k <n ; k++) {
            hash.put(a[k], hash.getOrDefault(k,0)+1);
        }
        for (int k = 0; k <m ; k++) {
            hash.put(b[k], hash.getOrDefault(k,0)+1);
        }
        for (int it: hash.keySet()){
            union.add(it);
        }
        return union;

    }
}
