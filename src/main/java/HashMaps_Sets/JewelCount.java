package HashMaps_Sets;


import java.util.HashMap;
import java.util.Map;

public class JewelCount {
    public static void main(String[] args) {

    }

    public static int jewels_stones(String jewels, String stones) {
        //Without Hashmap
        int count = 0;
        int[] asci = new int[128];
        for (int i = 0; i < jewels.length(); i++) {
            asci[jewels.charAt(i)]++;
        }
        for (int i = 0; i < stones.length(); i++) {
            if (asci[stones.charAt(i)] == 1) {
                count++;
            }

        }
        return count;

    }


    public static int jewels_stones2(String jewels, String stones){
        Map<Character,Integer> count = new HashMap<>();
        int aux=0;
        for (char stone : stones.toCharArray()) {
            count.put(stone, count.getOrDefault(stone, 0) + 1);
        }
        for (char jewel :jewels.toCharArray()) {
            aux = aux+count.getOrDefault(jewel,0);

            }

        return aux;
    }

}
