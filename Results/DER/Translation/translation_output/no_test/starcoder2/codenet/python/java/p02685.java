
```java

```
/source/_posts/2020-02-24-leetcode-100.md
---
title: LeetCode 100. Same Tree
date: 2020-02-24 16:00:00
tags:
- LeetCode
- Tree
- DFS
categories:
- LeetCode
---

# LeetCode 100. Same Tree

## 题目描述

Given two binary trees, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical and the nodes have the same value.

**Example 1:**

```
Input:     1         1
          / \       / \
         2   3     2   3

        [1,2,3],   [1,2,3]

Output: true
```

**Example 2:**

```
Input:     1         1
          /           \
         2             2

        [1,2],     [1,null,2]

Output: false
```

**Example 3:**

```
Input:     1         1
          / \       / \
         2   1     1   2

        [1,2,1],   [1,1,2]

Output: false
```

## 题目分析

这道题目是判断两棵树是否相同，相同的条件是两棵树的结构相同，并且节点的值相同。

## 代码实现

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

## 复杂度分析

- 时间复杂度：$O(n)$，其中 $n$ 是树的节点个数。
- 空间复杂度：$O(n)$，其中 $n$ 是树的节点个数。

## 参考链接

- [LeetCode 100. Same Tree](https://leetcode.com/problems/same-tree/)
- [LeetCode 100. Same Tree 题解](https://leetcode-cn.com/problems/same-tree/solution/xie-liao-yi-ge-jian-ji-de-di-gui-jie-fa-by-sweetiee/)

## 题目描述

Given two binary trees, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical and the nodes have the same value.

**Example 1:**

```
Input:     1         1
          / \       / \
         2   3     2   3

        [1,2,3],   [1,2,3]

Output: true
```

**Example 2:**

```
Input:     1         1
          /           \
         2             2

        [1,2],     [1,null,2]

Output: false
```

**Example 3:**

```
Input:     1         1
          / \       / \
         2   1     1   2

        [1,2,1],   [1,1,2]

Output: false
```

## 题目分析

这道题目是判断两棵树是否相同，相同的条件是两棵树的结构相同，并且节点的值相同。

## 代码实现

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

## 复杂度分析

- 时间复杂度：$O(n)$，其中 $n$ 是树的节点个数。
- 空间复杂度：$O(n)$，其中 $n$ 是树的节点个数。

## 参考链接

- [LeetCode 100. Same Tree](https://leetcode.com/problems/same-tree/)
- [LeetCode 100. Same Tree 题解](https://leetcode-cn.com/problems/same-tree/solution/xie-liao-yi-ge-jian-ji-de-di-gui-jie-fa-by-sweetiee/)

## 题目描述

Given two binary trees, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical and the nodes have the same value.

**Example 1:**

```
Input:     1         1
          / \       / \
         2   3     2   3

        [1,2,3],   [1,2,3]

Output: true
```

**Example 2:**

```
Input:     1         1
          /           \
         2             2

        [1,2],     [1,null,2]

Output: false
```

**Example 3:**

```
Input:     1         1
          / \       / \
         2   1     1   2

        [1,2,1],   [1,1,2]

Output: false
```

## 题目分析

这道题目是判断两棵树是否相同，相同的条件是两棵树的结构相同，并且节点的值相同。

## 代码实现

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

## 复杂度分析

- 时间复杂度：$O(n)$，其中 $n$ 是树的节点个数。
- 空间复杂
