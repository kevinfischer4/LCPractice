public class TwoSumSorted {

    // Time Complexity: O(n)
    // Space Complexity: O(1)

    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;

        while(l < r){
            if(numbers[l] + numbers[r] < target){
                l++;
            } else if (numbers[l] + numbers[r] > target) {
                r--;
            }
            else{
                return new int[] {l + 1, r + 1};
            }
        }

        return null;
    }

    public static void main(String[] args) {

    }
}
