import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TopKElementsInList {

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> count = new HashMap<>();
        @SuppressWarnings("unchecked")
        ArrayList<Integer>[] freq = new ArrayList[nums.length + 1];

        for (int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }

        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }
        for (HashMap.Entry<Integer, Integer> entry : count.entrySet()) {
            freq[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        int index = 0;
        for (int i = freq.length - 1; i > 0 && index < k; i--) {
            for (int n : freq[i]) {
                res[index++] = n;
                if (index == k) {
                    return res;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] test = new int[] {1,1,1,2,2,3};
        System.out.println(Arrays.toString(topKFrequent(test, 2)));
    }
}
