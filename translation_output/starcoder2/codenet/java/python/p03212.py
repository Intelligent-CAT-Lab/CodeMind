
```
import queue

N = int(input())

q = queue.Queue()
q.put('357')
q.put('375')
q.put('537')
q.put('573')
q.put('735')
q.put('753')

count = 0

if N < 1000:
    while not q.empty():
        s = q.get()
        if int(s) <= N:
            count += 1
    print(count)
else:
    while not q.empty():
        s = q.get()
        if int(s) <= N:
            count += 1
            for i in range(len(s) + 1):
                for c in '357':
                    q.put(s[:i] + c + s[i:])
    print(count)
```
/source/_posts/2019-03-10-leetcode-100.md
---
title: LeetCode 100. Same Tree
date: 2019-03-10 16:00:00
tags:
- LeetCode
- Tree
- DFS
categories:
- LeetCode
---

## LeetCode 100. Same Tree

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

## Solution

```python
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def isSameTree(self, p: TreeNode, q: TreeNode) -> bool:
        if p is None and q is None:
            return True
        elif p is None or q is None:
            return False
        elif p.val != q.val:
            return False
        else:
            return self.isSameTree(p.left, q.left) and self.isSameTree(p.right, q.right)
```
/source/_posts/2019-03-10-leetcode-101.md
---
title: LeetCode 101. Symmetric Tree
date: 2019-03-10 16:00:00
tags:
- LeetCode
- Tree
- DFS
categories:
- LeetCode
---

## LeetCode 101. Symmetric Tree

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

## Solution

```python
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def isSymmetric(self, root: TreeNode) -> bool:
        if root is None:
            return True
        return self.isSymmetricTree(root.left, root.right)

    def isSymmetricTree(self, left: TreeNode, right: TreeNode) -> bool:
        if left is None and right is None:
            return True
        elif left is None or right is None:
            return False
        elif left.val != right.val:
            return False
        else:
            return self.isSymmetricTree(left.left, right.right) and self.isSymmetricTree(left.right, right.left)
```

## Solution 2

```python
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def isSymmetric(self, root: TreeNode) -> bool:
        if root is None:
            return True
        queue = [root]
        while queue:
            next_queue = []
            values = []
            for node in queue:
                if node is not None:
                    values.append(node.val)
                    next_queue.append(node.left)
                    next_queue.append(node.right)
                else:
                    values.append(None)
            if values != values[::-1]:
                return False
            queue = next_queue
        return True
```

## Solution 3

```python
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def isSymmetric(self, root: TreeNode) -> bool:
        if root is None:
            return True
        stack = [(root.left, root.right)]
        while stack:
            left, right = stack.pop()
            if left is  return True
```
 None and right is None:
                continue
            elif left is None or right is None:
                return False
            elif left.val != right.val:
                return False
            else:
                stack.append((left.left, right.right))
                stack.append((left.right, right.left))
        return True
```

## Solution 4

```python
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
