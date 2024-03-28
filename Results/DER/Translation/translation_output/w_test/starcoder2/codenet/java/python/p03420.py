

```python
n, k = map(int, input().split())
ans = 0
for i in range(k + 1, n + 1):
    for j in range(0, n // i + 1):
        if i * (j + 1) - 1 <= n:
            ans += i - k
        else:
            ans += max(i - k - (i * (j + 1) - 1 - n), 0)
if k == 0:
    ans -= n
print(ans)
```
/source/_posts/2019-08-25-leetcode-100.md
---
title: LeetCode 100. Same Tree
date: 2019-08-25 10:00:00
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

## 解题思路

### 递归

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
        if p is None or q is None:
            return False
        if p.val != q.val:
            return False
        return self.isSameTree(p.left, q.left) and self.isSameTree(p.right, q.right)
```

### 迭代

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
            if p is None and q is None:
                continue
            if p is None or q is None:
                return False
            if p.val != q.val:
                return False
            stack.append((p.left, q.left))
            stack.append((p.right, q.right))
        return True
```
 1000000007

class Solution:
    def numSubarrayProductLessThanK(self, nums: List[int], k: int) -> int:
        if k <= 1:
            return 0
        prod = 1
        ans = 0
        left = 0
        for right, val in enumerate(nums):
            prod = prod * val
            while prod >= k:
                prod = prod // nums[left]
                left += 1
            ans += right - left + 1
            ans %= MOD
        return ans
```
/source/_posts/2019-08-25-leetcode-713.md
---
title: LeetCode 713. Subarray Product Less Than K
date: 2019-08-25 10:00:00
tags:
- LeetCode
- Array
- Sliding Window
categories:
- LeetCode
---

# LeetCode 713. Subarray Product Less Than K

## 题目描述

Your are given an array of positive integers nums.

Count and print the number of (contiguous) subarrays where the product of all the elements in the subarray is less than k.

Example 1:

```
Input: nums = [10, 5, 2, 6], k = 100
Output: 8
Explanation: The 8 subarrays that have product less than 100 are: [10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6].
Note that [10, 5, 2] is not included as the product of 100 is not strictly less than k.
```

Note:

0 < nums.length <= 50000.
0 < nums[i] < 1000.
0 <= k < 10^6.

## 解题思路

### 滑动窗口

```python
class Solution:
    def numSubarrayProductLessThanK(self, nums: List[int], k: int) -> int:
        if k <= 1:
            return 0
        prod = 1
        ans = 0
        left = 0
        for right, val in enumerate(nums):
            prod = prod * val
            while prod >= k:
                prod = prod // nums[left]
                left += 1
            ans += right - left + 1
        return ans
```

### 优化

```python
MOD =/source/_posts/2019-08-25-leetcode-102.md
---
title: LeetCode 102. Binary Tree Level Order Traversal
date: 2019-08-25 10:00:00
tags:
- LeetCode
- Tree
- BFS

