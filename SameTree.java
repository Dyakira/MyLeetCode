import structure.TreeNode;

import java.util.Stack;

/**
 * Given two binary trees, write a function to check if they are equal or not.
 * Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
 */
public class SameTree
{

    public boolean isSameTreeRecursive(TreeNode p, TreeNode q)
    {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;
        return isSameTreeRecursive(p.left, q.left) && isSameTreeRecursive(p.right, q.right);
    }

    public boolean isSameTreeIteration(TreeNode p, TreeNode q)
    {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        Stack<TreeNode> stackP = new Stack<>();
        Stack<TreeNode> stackQ = new Stack<>();
        stackP.add(p);
        stackQ.add(q);
        while (!stackP.isEmpty() && !stackQ.isEmpty())
        {
            TreeNode nodeP = stackP.pop();
            TreeNode nodeQ = stackQ.pop();
            if (nodeP.val != nodeQ.val) return false;
            if (nodeP.left != null && nodeQ.left != null)
            {
                stackP.push(nodeP.left);
                stackQ.push(nodeQ.left);
            } else if (nodeP.left == null && nodeQ.left == null)
            {
            } else return false;

            if (nodeP.right != null && nodeQ.right != null)
            {
                stackP.push(nodeP.right);
                stackQ.push(nodeQ.right);
            } else if (nodeP.right == null && nodeQ.right == null)
            {
            } else return false;
        }
        return stackP.isEmpty() && stackQ.isEmpty();
    }
}
