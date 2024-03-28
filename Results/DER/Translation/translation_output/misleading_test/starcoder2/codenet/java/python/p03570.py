

```python

```
/source/_posts/leetcode/leetcode-100-same-tree.md
---
title: leetcode 100. Same Tree
date: 2019-07-29 10:00:00
categories:
- [leetcode]
tags:
- leetcode
- python
- java
- C++
---

Given two binary trees, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical and the nodes have the same value.

Example 1:

```
Input:     1         1
          / \       / \
         2   3     2   3

        [1,2,3],   [1,2,3]

Output: true
```

Example 2:

```
Input:     1         1
          /           \
         2             2

        [1,2],     [1,null,2]

Output: false
```

Example 3:

```
Input:     1         1
          / \       / \
         2   1     1   2

        [1,2,1],   [1,1,2]

Output: false
```

<!-- more -->

# Solution

## Solution 1: Recursion

```python
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def isSameTree(self, p: TreeNode, q: TreeNode) -> bool:
        if not p and not q:
            return True
        if not p or not q:
            return False
        if p.val != q.val:
            return Fe:
            return self.isSameTree(p.left, q.left) and self.isSameTree(p.right, q.right)
```

## Solution 2: Iteration

```python
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def isSameTree(self, p: TreeNode, q: TreeNode) -> bool:
        stack = [(p, q)]
        while stack:
            p, q = stack.pop()
            if not p and not q:
                continue
            if not p or not q:
                return False
            if p.val != q.val:
                return False
            stack.append((p.left, q.left))
            stack.append((p.right, q.right))
        return True
```
alse
        if p.left and q.left:
            if p.left.val != q.left.val:
                return False
#         if p.right and q.right:
#             if p.right.val != q.right.val:
#                 return False
        if p.left and not q.left:
            return False
        if not p.left and q.left:
            return False
        if p.right and not q.right:
            return False
        if not p.right and q.right:
            return False
        return self.isSameTree(p.left, q.left) and self.isSameTree(p.right, q.right)
```

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
        if (p.left != null && q.left != null) {
            if (p.left.val != q.left.val) {
                return false;
            }
        }
        if (p.left != null && q.left == null) {
            return false;
        }
        if (p.left == null && q.left != null) {
            return false;
        }
        if (p.right != null && q.right != null) {
            if (p.right.val != q.right.val) {
                return false;
            }
        }
        if (p.right != null && q.right == null) {
            return false;
        }
        if (p.right == null && q.right != null) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
```

```cpp
/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
public:
    bool isSameTree(TreeNode* p, TreeNode* q) {
        if (p == NULL && q == NULL) {
            return true;
        }
        if (p == NULL || q == NULL) {
            return false;
        }
        if (p->val != q->val) {
            return false;
        }
        if (p->left != NULL && q->left != NULL) {
            if (p->left->val != q->left->val) {
                return false;
            }
        }
        if (p->left != NULL && q->left == NULL) {
            return false;
        }
        if (p->left == NULL && q->left != NULL) {
            return false;
        }
        if (p->right != NULL && q->right != NULL) {
            if (p->right->val != q->right->val) {
                return false;
            }
        }
        if (p->right != NULL && q->right == NULL) {
            return false;
        }
        if (p->right
