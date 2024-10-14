import java.util.HashSet;

/**
 * hasDuplicate
 */
public class HasDuplicateArray {

    // Time complexity: O(n)
    // Space Complexity: O(n)

    public static boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            }
            else{
                set.add(nums[i]);
            }
        }
        return false;
    }

    /**
     * Alternative Solution
     * 
     * public boolean hasDuplicate(int[] nums) {
        return Arrays.stream(nums).distinct().count() < nums.length;
    }
    */

    public static void main(String[] args) {
        System.out.println(hasDuplicate(new int[] {1, 2, 3, 2}));
    }
}