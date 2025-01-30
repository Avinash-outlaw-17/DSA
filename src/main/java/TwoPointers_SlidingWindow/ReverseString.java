package TwoPointers_SlidingWindow;

public class ReverseString {
    public static void main(String[] args) {
   char [] s ={'h','e','l','l','o'};
    ReverseString rs = new ReverseString();

    }
    public static void reverse(char[]s){
        int start=0,end=s.length;
        while (start<end){
            char reverse = s[start];
            s[start]=s[end];
            s[end]=reverse;
            start++;
            end--;
            System.out.println(reverse);
        }

    }
}
