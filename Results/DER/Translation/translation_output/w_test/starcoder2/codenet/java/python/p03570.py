

```python

```
/source/_posts/leetcode/leetcode-binary-search-tree-iterator.md
---
title: 'Leetcode 173. Binary Search Tree Iterator'
date: 2019-08-26 10:00:00
tags: ['Leetcode', 'Tree', 'Stack', 'Design']
categories: ['Leetcode']
---

# Leetcode 173. Binary Search Tree Iterator

<!-- more -->

## Problem

Implement an iterator over a binary search tree (BST). Your iterator will be initialized with the root node of a BST.

Calling next() will return the next smallest number in the BST.

Example:

![img](https://assets.leetcode.com/uploads/2018/12/25/bst-tree.png)

```
BSTIterator iterator = new BSTIterator(root);
iterator.next();    // return 3
iterator.next();    // return 7
iterator.hasNext(); // return true
iterator.next();    // return 9
iterator.hasNext(); // return true
iterator.next();    // return 15
iterator.hasNext(); // return true
iterator.next();    // return 20
iterator.hasNext(); // return false
```

Note:

- next() and hasNext() should run in average O(1) time and uses O(h) memory, where h is the height of the tree.
- You may assume that next() call will always be valid, that is, there will be at least a next smallest number in the BST when next() is called.

## Solution

### Solution 1

```python
# Definition for a lf, root):
        """
        :type root: TreeNode
        """
        self.stack = []
        self.pushAll(root)

    def hasNext(self):
        """
        :rtype: bool
        """
        return len(self.stack) > 0

    def next(self):
        """
        :rtype: int
        """
        tmpNode = self.stack.pop()
        self.pushAll(tmpNode.right)
        return tmpNode.val

    def pushAll(self, node):
        while node is not None:
            self.stack.append(node)
            node = node.left

# Your BSTIterator object will be instantiated and called as such:
# obj = BSTIterator(root)
# param_1 = obj.next()
# param_2 = obj.hasNext()
```
binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class BSTIterator(object):

    def __init__(se/source/_posts/leetcode/leetcode-binary-tree-level-order-traversal.md
---
title: 'Leetcode 102. Binary Tree Level Order Traversal'
date: 2019-08-26 10:00:00
tags: ['Leetcode', 'Tree', 'Breadth-first Search']
categories: ['Leetcode']
---

# Leetcode 102. Binary Tree Level Order Traversal

<!-- more -->

## Problem

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

### Solution 1

```python
# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def levelOrder(self, root):
        """
        :type root: TreeNode
        :rtype: List[List[int]]
        """
        if root is None:
            return []
        queue = [root]
        res = []
        while queue:
            size = len(queue)
            tmp = []
            for i in range(size):
                node = queue.pop(0)
                tmp.append(node.val)
                if node.left is not None:
                    queue.append(node.left)
                if node.right is not None:
                    queue.append(node.right)
            res.append(tmp)
        return res
```
/source/_posts/leetcode/leetcode-binary-tree-level-order-traversal-ii.md
---
title: 'Leetcode 107. Binary Tree Level Order Traversal II'
date: 2019-08-26 10:00:00
tags: ['Leetcode', 'Tree', 'Breadth-first Search']
categories: ['Leetcode']
---

# Leetcode 107. Binary Tree Level Order Traversal II

<!-- more -->

## Problem

Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).

For example:
Given binary tree [3,9,20,null,null,15,7],

```
    3
   / \
  9  20
    /  \
   15   7
```

return its bottom-up level order traversal as:

```
[
  [15,7],
  [9,20],
  [3]
]
```

## Solution

### Solution 1

```python
# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def levelOrderBottom(self, root):
       
