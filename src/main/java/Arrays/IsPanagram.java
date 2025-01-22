package Arrays;

import java.util.HashSet;
import java.util.Set;

public class IsPanagram {
    public static void main(String[] args) {
        String sentence = "leetcode";
        boolean res = isPan(sentence);
        System.out.println(res);
    }
    public static boolean isPan(String sentence){
        Set<Character> ch = new HashSet<>();
        for(char c:sentence.toCharArray()) {
            ch.add(c);

        }
        return ch.size()==26;
    }
}
