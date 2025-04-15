package TwoPointers_SlidingWindow;

public class ReverseString {
    public static void main(String[] args) {
   char [] s ={'h','e','l','l','o'};
    reverse(s);
        System.out.println("Reversed:" + new String(s));
    }
    public static void reverse(char[]s){
        int start=0,end=s.length-1;
        while (start<end){
            char reverse = s[start];
            s[start]=s[end];
            s[end]=reverse;
            start++;
            end--;

        }

    }
}
