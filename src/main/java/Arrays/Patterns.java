package Arrays;

public class Patterns {
    public static void main(String[] args) {
        //Strivers Patterns Problems;
        int n = 5;
       pattern13(n);
    }
    public static void pattern3( int n){
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void pattern6( int n){
        for (int i = n; i >=0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void pattern7( int n){
        for (int i = 0; i <n; i++) {
            for (int j = 0; j<n-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <2*i+1 ; j++) {
                System.out.print("*");
            }
            for (int j = 0; j<n-i-1; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
    public static void pattern8( int n){
        for (int i = 0; i <n; i++) {
            for (int j = 0; j<i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j<(2*n-(2*i+1)) ; j++) {
                System.out.print("*");
            }
            for (int j = 0; j<i; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
    public static void pattern10( int n){
        for (int i = 1; i <=2*n-1; i++) {
            int stars =i;
            if(i>n) {stars= 2*n-i;}
            for (int j = 1; j<=stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern11( int n){
        int start =0;
        for (int i = 0; i < n; i++) {
            if(i%2==0){
                start=1;
            }else start=0;
            for (int j = 1; j <=i; j++) {
                System.out.print(start);
                start =1-start;
            }
            System.out.println();
        }
    }
    public static void pattern13( int n){
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+i);
            }
            System.out.println();
        }
    }

}
