import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMaximum {
    

    public int[] maxSlidingWindow(int[] nums, int k) {
        
        int n = nums.length;
        int[] output = new int[n - k + 1];
        Deque<Integer> q = new ArrayDeque<>();
        int l = 0, r = 0;

        while (r < n) {
            while (!q.isEmpty() && nums[q.peekLast()] < nums[r]) {
                q.pollLast();
            }
            q.offer(r);

            if (l > q.peekFirst()) {
                q.pollFirst();
            }

            if (r + 1 >= k) {
                output[l] = nums[q.peekFirst()];
                l++;
            }
            r++;
        }

        return output;
    }
}
