public class BinaryTreeFromPreorderAndInorderTraversal {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder, inorder, 0, 0, inorder.length - 1);
    }
    
    private TreeNode buildTree(int[] preorder, int[] inorder, int preStart, int inStart, int inEnd) {
        if (preStart >= preorder.length || inStart > inEnd) {
            return null;
        }
        
        TreeNode root = new TreeNode(preorder[preStart]);
        int inIndex = 0;
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == root.val) {
                inIndex = i;
            }
        }
        
        root.left = buildTree(preorder, inorder, preStart + 1, inStart, inIndex - 1);
        root.right = buildTree(preorder, inorder, preStart + inIndex - inStart + 1, inIndex + 1, inEnd);
        return root;
    }
}
