package Heaps_Priority;

import java.util.PriorityQueue;

public class KthLargest {
    public static void main(String[] args) {

    }
    public static int KLarge(int[] nums,int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(k+1);
        for (int i:nums){
            pq.add(i);
            if(pq.size()>k){
                pq.poll();
            }

        }
        return pq.poll();
    }
}
