
```java

```


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
 * @author: Created by zhanghl
 * @date: 2020/12/29 10:46
 * @description:
 */
public class Q102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            res.add(list);
        }
        return res;
    }
}/src/main/java/com/leetcode/problems/medium/Q104.java
package com.leetcode.problems.medium;

import com.leetcode.problems.TreeNode;

/**
 * @author: Created by zhanghl
 * @date: 2020/12/29 10:52
 * @description:
 */
public class Q104 {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
/src/main/java/com/leetcode/problems/medium/Q105.java
package com.leetcode.problems.medium;

import com.leetcode.problems.TreeNode;

/**
 * @author: Created by zhanghl
 * @date: 2020/12/29 11:00
 * @description:
 */
public class Q105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    private TreeNode buildTree(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd) {
        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }
        int rootVal = preorder[preStart];
        TreeNode root = new TreeNode(rootVal);
        int index = 0;
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == rootVal) {
                index = i;
                break;
            }
        }
        int leftSize = index - inStart;
        root.left = buildTree(preorder, preStart + 1, preStart + leftSize, inorder, inStart, index - 1);
        root.right = buildTree(preorder, preStart + leftSize + 1, preEnd, inorder, index + 1, inEnd);
        return root;
    }

    public static void main(String[] args) {
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};
        Q105 q105 = new Q105();
        TreeNode root = q105.buildTree(preorder, inorder);
        System.out.println(root);
    }
}

/*
public TreeNode buildTree(int[] preorder, int[] inorder) {
    return buildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
}

private TreeNode buildTree(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd) {
    if (preStart > preEnd || inStart > inEnd) {
        return null;
    }
    int rootVal = preorder[preStart];
    TreeNode root = new TreeNode(rootVal);
    int index = 0;
    for (int i = inStart; i <= inEnd; i++) {
        if (inorder[i] == rootVal) {
            index = i;
            break;
        }
    }
    int leftSize = index - inStart;
    root.left = buildTree(preorder, preStart + 1, preStart + leftSize, inorder, inStart, index - 1);
    root.right = buildTree(preorder, preStart + leftSize + 1, preEnd, inorder, index + 1, inEnd);
    return root;
}

public TreeNode buildTree(int[] preorder, int[] inorder) {
    if (preorder == null || preorder.length == 0) {
        return null;
    }
    int rootVal = preorder[0];
    TreeNode root = new TreeNode(rootVal);
    int index = 0;
    for (int i = 0; i < inorder.length; i++) {
        if (inorder[i] == rootVal) {
            index = i;
            break;
        }
    }
    int[] leftPreorder = new int[index];
    int[] leftInorder = new int[index];
    int[] rightPreorder = new int[preorder.length - index - 1];
    int[] rightInorder = new int[preorder.length - index - 1];
    System.arraycopy(preorder, 1, leftPreorder, 0, index);
    System.arraycopy(inorder, 0, leftInorder, 0, index);
    System.arraycopy(preorder, index + 1, rightPreorder, 0, preorder.length - index - 1);
    System.arraycopy(inorder, index + 1, rightInorder, 0, preorder.length - index - 1);
    root.left = buildTree(leftPreorder, leftInorder);
    root.right = buildTree(rightPreorder, rightInorder);
    return root;
}

public TreeNode buildTree(int[] preorder, int[] inorder) {
    if (preorder == null || preorder.length == 0) {
        return null;
    }
    int rootVal = preorder[0];
    TreeNode root = new TreeNode(rootVal);
    int index = 0;
    for (int i = 0; i < inorder.length; i++) {
        if (inorder[i] == rootVal) {
            index = i;
            break;
        }
    }
    int[] leftPreorder = new int[index];
    int[] leftInorder = new int[index];
    int[] rightPreorder = new int[preorder.length - index - 1];
    int[] rightInorder = new int[preorder.length - index - 1];
    System.arraycopy(preorder, 1, leftPreorder, 0, index);
    System.arraycopy(inorder, 0, leftInorder, 0, index);
    System.arraycopy(preorder, index + 1, rightPreorder, 0, preorder.length - index - 1);
    System.arraycopy(inorder, index + 1, rightInorder, 0, preorder.length - index - 1);
    root.left = buildTree(leftPreorder, leftInorder);
    root.right = buildTree(rightPreorder, rightInorder);
    return root;
}

public TreeNode buildTree(int[] preorder, int[] inorder) {
    if (preorder == null || preorder.length == 0) {
        return null;
    }
    int rootVal = preorder[0];
    TreeNode root = new TreeNode(rootVal);
    int index = 0;
    for (int i = 0
