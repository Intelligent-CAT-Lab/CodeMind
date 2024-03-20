

```java

```
/docs/leetcode/data-structure/tree/102.md
# 102. Binary Tree Level Order Traversal (Easy)

## Link

https://leetcode.com/problems/binary-tree-level-order-traversal/

## Description

Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

For example:
Given binary tree [3,9,20,null,null,15,7],

```
    3
   / \
  9  20
    /  \
   15   7
```

return its level order traversal as:

```
[
  [3],
  [9,20],
  [15,7]
]
```

## Solution

### Approach 1: Breadth-First Search

#### Intuition

To solve this problem, we can use the Breadth-First Search approach.

#### Algorithm

1. Start from the root node and insert it into a queue.
2. While the queue is not empty, do the following:
    1. Remove the first node from the queue and insert it into the result list.
    2. If the node has a left child, insert it into the queue.
    3. If the node has a right child, insert it into the queue.
3. Return the result list.

#### Implementation

```java
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
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
            result.add(level);
        }

        return result;
    }
}
```

#### Complexity Analysis

- Time complexity: O(n), where n is the number of nodes in the tree. We visit each node once.
- Space complexity: O(n), where n is the number of nodes in the tree. We use a queue to store the nodes in each level.

### Approach 2: Depth-First Search

#### Intuition

To solve this problem, we can use the Depth-First Search approach.

#### Algorithm

1. Start from the root node and insert it into a stack.
2. While the stack is not empty, do the following:
    1. Remove the top node from the stack and insert it into the result list.
    2. If the node has a right child, insert it into the stack.
    3. If the node has a left child, insert it into the stack.
3. Return the result list.

#### Implementation

```java
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            int size = stack.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = stack.pop();
                level.add(node.val);
                if (node.right != null) {
                    stack.push(node.right);
                }
                if (node.left != null) {
                    stack.push(node.left);
                }
evelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
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
            result.add(level);
        }

        return result;
    }
}
```

#### Complexity Analysis

- Time complexity: O(n), where n is the number of nodes in the tree. We visit each node once.
- Space complexity: O(n), where n is the number of nodes in the tree. We use a queue to store the nodes in each level.

### Approach 2: Depth-First Search

#### Intuition

To solve this problem, we can use the Depth-First Search approach.

#### Algorithm


