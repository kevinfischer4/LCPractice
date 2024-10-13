public class MissingNumber {

    public int missingNumber(int[] nums) {
        // solution with XOR
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res ^= i ^ nums[i];
        }
        return res ^ nums.length;
    }

    // solution with sum
        /*
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return (nums.length * (nums.length + 1) / 2) - sum;
         */
}
