package Heaps_Priority;

import java.util.*;

public class TopKFrequentElements {
    public static void main(String[] args) {

    }
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> minHeap = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            minHeap.offer(entry);
            if(minHeap.size()>k){
                minHeap.poll();
            }

        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++){
            result[i] = Objects.requireNonNull(minHeap.poll().getKey());
        }

        return  result;

    }

}
