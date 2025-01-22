package Arrays;

import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {
    public static void main(String[] args) {
int[] candies = {2,3,5,1,3};
int extra = 3;
        System.out.println(kidswithcandies(candies,extra));
    }
    public static List<Boolean> kidswithcandies(int[] candies,int extraCandies){
        List<Boolean> result = new ArrayList<>(candies.length);
        int maxCandy = 0;
        for (int item : candies) {
            if(item>maxCandy){
                maxCandy=item;
            }
        }
            for (int i = 0; i <candies.length ; i++) {
                if((candies[i]+extraCandies)>=maxCandy){
                    result.add(true);
                }
                else result.add(false);

            }
        return result;

        }

    }

