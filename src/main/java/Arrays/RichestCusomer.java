package Arrays;

public class RichestCusomer {
    public static void main(String[] args) {
int[][] accounts = {{1,2,3},{3,2,1}};
int wealth = maxwealth(accounts);
        System.out.println(wealth);
    }

    public static int maxwealth(int[][] accounts){
        int wealth =0;
        int m = accounts.length;
        for (int i = 0; i <m ; i++) {
            int sum=0;
            for (int j = 0; j <accounts[i].length ; j++) {
                sum = sum+accounts[i][j];

            }
            wealth = Math.max(wealth,sum);
            }
            return wealth;

        }
    }

