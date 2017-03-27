import structure.TreeNode;

/**
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 *For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
 *
     1
    / \
   2   2
  / \ / \
 3  4 4  3
 But the following [1,2,2,null,3,null,3] is not:
     1
    / \
   2   2
   \   \
   3    3
 *
 * Bonus points if you could solve it both recursively and iteratively.
 */

public class SymmetricTree {
    public boolean isSymmetricRecursively(TreeNode root) {
        return root == null || isSymmetricSubTree(root.left, root.right);
    }

    private boolean isSymmetricSubTree(TreeNode left, TreeNode right){
        if(left == null || right == null)
            return left == right;
        if(left.val != right.val)
            return false;
        return isSymmetricSubTree(left.left, right.right) && isSymmetricSubTree(left.right, right.left);
    }

    //TODO iteratively
}
