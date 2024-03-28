

```python
import math

def solver(n, a):
    ans = n
    for m in range(2, 41):
        c = int(math.pow(n, 1.0 / m))
        for i in range(max(c - 2, 2), c + 3):
            if math.log(i) * (m - 1) > 40 * math.log(2):
                continue
            for j in range(0, m):
                res = a * (m - 1)
                res += j * i + (m - 1 - j) * (i + 1)
                den = pow(i, j) * pow(i + 1, m - 1 - j)
                res += (n + den - 1) / den
                ans = min(ans, res)
    print(ans)

n, a = map(int, input().split())
solver(n, a)
```
/content/posts/2019-01-01-leetcode-100-same-tree.md
---
title: "Leetcode 100. Same Tree"
date: 2019-01-01T16:00:00+08:00
draft: false
categories: ["leetcode"]
tags: ["leetcode", "python", "java"]
---

### Problem

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

### Solution

```python
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def isSameTree(self, p, q):
        """
        :type p: TreeNode
        :type q: TreeNode
        :rtype: bool
        """
        if p is None and q is None:
            return True
        if p is None or q is None:
            return False
        if p.val != q.val:
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
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
```
 1000000007;
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[m];
        for (int i = 0; i < m; ++i) {
            b[i] = sc.nextInt();
        }
        solver(n, m, k, a, b);
    }

    void solver(int n, int m, int k, int[] a, int[] b) {
        int[] c = new int[n + m];
        for (int i = 0; i < n; ++i) {
            c[i] = a[i];
        }
        for (int i = 0; i < m; ++i) {
            c[n + i] = b[i];
        }
        Arrays.sort(c);
        long ans = 0;
        for (int i = 0; i < n + m; ++i) {
            int l = i - k;
            int r = i + k;
            if (l < 0) {
                l = 0;
            }
            if (r >= n + m) {
                r = n + m - 1;
            }
            ans += c[r] - c[l];
        }
        System.out.println(ans);
    }

    static void tr(Object... objects) {
        System.out.println(Arrays.deepToString(objects));
    }

}

```

python code:

```python
import math

def solver(n, m, k, a, b):
    c = a + b
    c.sort()
    ans = 0
    for i in range(n + m):
        l = i - k
        r = i + k
        if l < 0:
            l = 0
        if r >= n + m:
            r = n + m - 1
        ans += c[r] - c[l]
    print(ans)

n, m, k = map(int, input().split())
a = list(map(int, input().split()))
b = list(map(int, input().split()))
solver(n, m, k, a, b)
```
/content/posts/2019-01-01-cf-1000000000-a.md
---
title: "CF 1000000000 A"
date: 2019-0
