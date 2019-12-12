package solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Created by lvwei on 5/24/2016.
 * https://leetcode.com/problems/top-k-frequent-elements/
 * Total Accepted: 10072 Total Submissions: 23977 Difficulty: Medium
 * Given a non-empty array of integers, return the k most frequent elements.
 * <p>
 * For example,
 * Given [1,1,1,2,2,3] and k = 2, return [1,2].
 */
public class TopKFrequentElements {
    public List<Integer> topKFrequent(int[] nums, int k) {
        if (nums == null || k == 0) return null;
        PriorityQueue<Frequency> pq = new PriorityQueue<>();
        HashMap<Integer, Frequency> map = new HashMap<>();
        for (int i : nums) {
            if (map.containsKey(i))
                map.get(i).addFrequency();
            else map.put(i, new Frequency(i));
        }
        pq.addAll(map.values());
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            answer.add(pq.poll().num);
        }
        return answer;
    }

    class Frequency implements Comparable<Frequency> {
        int num;
        int frequency;

        public Frequency(int num) {
            this.num = num;
            frequency = 1;
        }

        public void addFrequency() {
            frequency++;
        }

        @Override
        public int compareTo(Frequency o) {
            return -Integer.compare(this.frequency, o.frequency);
        }
    }
}
