package Arrays_and_Hashing;

import java.util.*;

public class TopKFrequentElement {

    public static PriorityQueue<Integer> topKFrequentElement(List<Integer> integerList, Integer k) {

        Map<Integer, Integer> hashMap = new HashMap<>();
        for (Integer num : integerList) {
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(
                Comparator.comparingInt(hashMap::get)
        );

        for (Integer number : hashMap.keySet()) {
            minHeap.add(number);

            if (minHeap.size() >  k) {
                minHeap.poll();
            }
        }

        return minHeap;
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> result = topKFrequentElement(Arrays.asList(1,2,3,4,5,6,6,6,3,3,3), 3);
        System.out.println(result);
    }
}
