
```java
import java.util.*;

public class Main {
    static String[] tokens;
    static int cur;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String src = sc.nextLine();
        tokens = src.split(" ");
        cur = 0;
        int[] ans = parse_formula();
        System.out.println(ans[0] + " " + ans[1]);
    }

    static int[] parse_formula() {
        return parse_or();
    }

    static int[] parse_or() {
        int[] lhs = parse_and();
        if (tokens[cur].equals("|")) {
            cur++;
            int[] rhs = parse_or();
            int zero = Math.min(lhs[0], lhs[1] + rhs[0]);
            int one = Math.min(lhs[0] + rhs[1], lhs[1]);
            return new int[]{zero, one};
        }
        return lhs;
    }

    static int[] parse_and() {
        int[] lhs = parse_term();
        if (tokens[cur].equals("&")) {
            cur++;
            int[] rhs = parse_and();
            int zero = Math.min(lhs[0], lhs[1] + rhs[0]);
            int one = lhs[1] + rhs[1];
            return new int[]{zero, one};
        }
        return lhs;
    }

    static int[] parse_term() {
        if (tokens[cur].equals("?")) {
            cur++;
            return new int[]{1, 1};
        } else if (tokens[cur].equals("(")) {
            cur++;
            int[] res = parse_or();
            if (!tokens[cur].equals(")")) {
                throw new RuntimeException("not closed");
            }
            cur++;
            return res;
        }
        throw new RuntimeException("invalid token");
    }
}
```
/content/posts/2020-04-26-leetcode-102.md
---
title: "Leetcode 102"
date: 2020-04-26T16:00:00+08:00
draft: false
categories: ["Leetcode"]
---

## 102. Binary Tree Level Order Traversal

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

### Solution

```java
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                level.add(node.val);
                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
            }
            ans.add(level);
        }
        return ans;
    }
}
```
/content/posts/2020-04-26-leetcode-103.md
---
title: "Leetcode 103"
date: 2020-04-26T16:00:00+08:00
draft: false
categories: ["Leetcode"]
---

## 103. Binary Tree Zigzag Level Order Traversal

Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie    }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean reverse = false;
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                level.add(node.val);
                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
            }
            if (reverse) {
                Collections.reverse(level);
            }
            reverse = !reverse;
            ans.add(level);
        }
        return ans;
    }
}
```
, from left to right, then right to left for the next level and alternate between).

For example:
Given binary tree [3,9,20,null,null,15,7],
```
    3
   / \
  9  20
    /  \
   15   7
```
return its zigzag level order traversal as:
```
[
  [3],
  [20,9],
  [15,7]
]
```

### Solution

```java
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        if (root.left == null && root.right == null) {
            return Arrays.asList(Arrays.asList(root.val));
      }
        return ans;
    }
}
```
/content/posts/2020-04-26-leetcode-104.md
---
title: "Leetcode 104"
date: 2020-04-26T16:00:00+08:00
draft: false
categories: ["Leetcode"]
---

## 104. Maximum Depth of Binary Tree

Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

Note: A leaf is
