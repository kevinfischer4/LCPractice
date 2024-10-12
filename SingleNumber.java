public class SingleNumber {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int n : nums) {
            res ^= n;   // XOR
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
