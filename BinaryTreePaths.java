import structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a binary tree, return all root-to-leaf paths.
  For example, given the following binary tree:
     1
   /   \
  2     3
  \
   5

 * ["1->2->5", "1->3"]
 */
public class BinaryTreePaths {

    private List<String> paths = new ArrayList<>();
    private StringBuilder path = new StringBuilder();

    public List<String> binaryTreePaths(TreeNode root) {
        if(root != null ) searchTree(root);
        return paths;
    }

    private void searchTree(TreeNode root){
        if(root == null) return ;
        int length = path.length(); //重置单次 不加["1->2->5","1->2->53"] Expected ["1->2->5","1->3"]
        path.append(root.val);
        if(root.left != null || root.right != null){
            path.append("->");
            searchTree(root.left);
            searchTree(root.right);
        }else{
            paths.add(path.toString());
        }
        path.setLength(length);
    }
}


