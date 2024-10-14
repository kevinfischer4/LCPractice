public class TwoSumArray {

    // Time complexity: O(n2)
    // Space Complexity: O(1)

    public static int[] twoSum(int[] nums, int target) {
        
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[] {i, j};
                }
            }
        }

        return null;
    }

    /*
     * Better alternative with
     * 
     * Time complexity: O(n)
     * Space Complexity: O(n)
     * 
     * public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> prevMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;

            if (prevMap.containsKey(diff)) {
                return new int[] { prevMap.get(diff), i };
            }

            prevMap.put(num, i);
        }

        return new int[] {};
    }
     */


    public static void main(String[] args) {
        System.out.println(twoSum(new int[] {3, 4, 5, 6}, 7).toString());
    }
}
