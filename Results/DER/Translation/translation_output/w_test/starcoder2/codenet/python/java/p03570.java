

```java
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(f(str));
    }

    public static int f(String str) {
        HashMap<Integer, Integer> s = new HashMap<>();
        s.put(0, 0);
        int pat = 0;
        int[] bits = new int[26];
        for (int i = 0; i < 26; i++) {
            bits[i] = 1 << i;
        }
        int lenOfStr = str.length();
        for (int i = 0; i < lenOfStr; i++) {
            pat ^= bits[str.charAt(i) - 'a'];
            int min = lenOfStr;
            for (int bit : bits) {
                int tmp = s.getOrDefault(pat ^ bit, lenOfStr) + 1;
                if (tmp < min) {
                    min = tmp;
                }
            }
            min = Math.min(min, s.getOrDefault(pat, lenOfStr));
            s.put(pat, min);
        }
        if (pat == 0) {
            return 1;
        }
        return s.get(pat);
    }
}
```

## 2. 
Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".

```java
public class Solution {
    public String reverseString(String s) {
        char[] chars = s.toCharArray();
        int len = chars.length;
        for (int i = 0; i < len / 2; i++) {
            char tmp = chars[i];
            chars[i] = chars[len - i - 1];
            chars[len - i - 1] = tmp;
        }
        return new String(chars);
    }
}
```
/source/_posts/2017-03-20-leetcode-100-same-tree.md
---
title: Leetcode 100. Same Tree
date: 2017-03-20 16:00:00
tags: [leetcode, tree, depth-first-search]
---

# 100. Same Tree

Given two binary trees, write a function to check if they are equal or not.

Two binary trees are considered equal if they are structurally identical and the nodes have the same value.

<!-- more -->

## Solution

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
public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
```
/source/_posts/2017-03-20-leetcode-101-symmetric-tree.md
---
title: Leetcode 101. Symmetric Tree
date: 2017-03-20 16:00:00
tags: [leetcode, tree, depth-first-search, breadth-first-search]
---

# 101. Symmetric Tree

Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

```
    1
   / \
  2   2
 / \ / \
3  4 4  3
```

But the following [1,2,2,null,3,null,3] is not:

```
    1
   / \
  2   2
   \   \
   3    3
```

Note:
Bonus points if you could solve it both recursively and iteratively.

<!-- more -->

## Solution

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
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSymmetric(root.left, root.right);
    }

    private boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if (left.val != right.val) {
            return false;
        }
        return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }
}
```
/source/_posts/2017-03-20-leetcode-102-binary-tree-level-order-traversal.md
---
title: Leetcode 102. Binary Tree Level Order Traversal
date: 2017-03-20 16:00:00
tags: [leetcode, tree, breadth-first-search]
---

# 102. Binary Tree Level Order Traversal

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

<!-- more -->

## Solution

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
public class Solution {
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

## Solution 2

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
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
           
