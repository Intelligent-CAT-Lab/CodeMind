
```java

```
/src/main/java/com/leetcode/problems/medium/Q102.java
package com.leetcode.problems.medium;

import com.leetcode.problems.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author 
 * @date 2020/10/20
 */
public class Q102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            res.add(level);
        }
        return res;
    }

    public List<List<Integer>> levelOrder2(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
           eue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            res.add(level);
        }
        return res;
    }
}
 return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        qu/src/main/java/com/leetcode/problems/medium/Q103.java
package com.leetcode.problems.medium;

import com.leetcode.problems.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author 
 * @date 2020/10/20
 */
public class Q103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean reverse = false;
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (reverse) {
                    level.add(0, node.val);
                } else {
                    level.add(node.val);
                }
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            res.add(level);
            reverse = !reverse;
        }
        return res;
    }
}
/src/main/java/com/leetcode/problems/medium/Q104.java
package com.leetcode.problems.medium;

import com.leetcode.problems.TreeNode;

/**
 * @author 
 * @date 2020/10/20
 */
public class Q104 {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(t.left, depth + 1);
        maxDepth(root.right, depth + 1);
    }
}
maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    private int depth = 0;

    public int maxDepth2(TreeNode root) {
        maxDepth(root, 1);
        return depth;
    }

    private void maxDepth(TreeNode root, int depth) {
        if (root == null) {
            return;
        }
        if (depth > this.depth) {
            this.depth = depth;
        }
        maxDepth(roo  }
        return res;
    }
}
/src/main/java/com/leetcode/problems/medium/Q105.java
package com.leetcode.problems.medium;

import com.leetcode.problems.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 
 * @date 2020/10/20
 */
public class Q105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || preorder.length == 0) {
            return null;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return buildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, map);
    }

    private TreeNode buildTree(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd, Map<Integer, Integer> map) {
        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[preStart]);
        int index = map.get(preorder[preStart]);
        root.left = buildTree(preorder, preStart + 1, preStart + index - inStart, inorder, inStart, index - 1, map);
        root.right = buildTree(preorder, preStart + index - inStart + 1, preEnd, inorder, index + 1, inEnd, map);
        return root;
    }

    public TreeNode buildTree2(int[] preorder, int[] inorder) {
        if (preorder == null || preorder.length == 0) {
            return null;
        }
        return buildTree2(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    private TreeNode buildTree2(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd) {
        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[preStart]);
        int index = 0;
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == preorder[preStart]) {
                index = i;
                break;
            }
        }
        root.left = buildTree2(preorder, preStart + 1, preStart + index - inStart, inorder, inStart, index - 1);
        root.right
