import com.sun.xml.internal.messaging.saaj.packaging.mime.util.QEncoderStream;
import structure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * You need to find the largest value in each row of a binary tree.
 * Input:
 * <p>
 *     1
 *    / \
 *   3   2
 *  / \   \
 * 5   3   9
 * <p>
 * Output: [1, 3, 9]
 */
public class FindLargestValueInTreeRow {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                max = Math.max(max, node.val);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            res.add(max);
        }
        return res;
    }

}
