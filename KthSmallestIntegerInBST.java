import java.util.Stack;

public class KthSmallestIntegerInBST {
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        int count = 0;
        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            
            current = stack.pop();
            count++;
            if (count == k) {
                return current.val;
            }
            current = current.right;
        }
        return -1;
    }
}
