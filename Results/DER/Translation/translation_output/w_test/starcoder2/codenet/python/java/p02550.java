
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        arr[0] = x;
        Set<Integer> s = new HashSet<>();
        s.add(x);
        int h = -1;
        int r = 0;
        for (int i = 1; i < n; i++) {
            int val = (arr[i - 1] * arr[i - 1]) % m;
            if (!s.contains(val)) {
                arr[i] = val;
                s.add(val);
            } else {
                h = i;
                r = val;
                break;
            }
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            res += arr[i];
        }
        if (h != -1) {
            int[] new_arr = new int[n - h - 1];
            for (int i = 0; i < n - h - 1; i++) {
                new_arr[i] = arr[h + 1 + i];
            }
            int rest = n - (h + 1);
            int c = new_arr.length;
            int q = rest / c;
            int ssum = 0;
            for (int i = 0; i < c; i++) {
                ssum += new_arr[i];
            }
            ssum *= q;
            int r1 = rest % c;
            for (int i = 0; i < r1; i++) {
                ssum += new_arr[i];
            }
            res += ssum;
        }
        System.out.println(res);
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
        char[] arr = s.toCharArray();
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            char tmp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = tmp;
        }
        return new String(arr);
    }
}
```

## 3.

Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

```java
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int[] arr = new int[256];
        int res = 0;
        int i = 0;
        for (int j = 0; j < n; j++) {
            char c = s.charAt(j);
            arr[c]++;
            while (arr[c] > 1) {
                char c1 = s.charAt(i);
                arr[c1]--;
                i++;
            }
            res = Math.max(res, j - i + 1);
        }
        return res;
    }
}
```
/source/_posts/leetcode/leetcode-binary-tree-maximum-path-sum.md
---
title: 'Leetcode 124. Binary Tree Maximum Path Sum'
date: 2017-10-10 10:00:00
tags: [Leetcode, Tree, DFS]
categories: [Leetcode]
---

# Leetcode 124. Binary Tree Maximum Path Sum

<!--more-->

## Desicription

Given a binary tree, find the maximum path sum.

For this problem, a path is defined as any sequence of nodes from some starting node to any node in the tree along the parent-child connections. The path must contain at least one node and does not need to go through the root.

For example:
Given the below binary tree,

       1
      / \
     2   3
Return 6.

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
    int res = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return res;
    }
    public int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = dfs(root.left);
        int right = dfs(root.right);
        int sum = root.val;
        if (left > 0) {
            sum += left;
        }
        if (right > 0) {
            sum += right;
        }
        res = Math.max(res, sum);
        return Math.max(root.val, Math.max(root.val + left, root.val + right));
    }
}
```
/source/_posts/leetcode/leetcode-binary-tree-level-order-traversal.md
---
title: 'Leetcode 102. Binary Tree Level Order Traversal'
date: 2017-09-25 10:00:00
tags: [Leetcode, Tree, BFS]
categories: [Leetcode]
---

# Leetcode 102. Binary Tree Level Order Traversal

<!--more-->

## Desicription

Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

For example:
Given binary tree [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7
return its level order traversal as:

[
  [3],
  [9,20],
  [15,7]
]

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
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                list.add(node.val);
                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
            }
            res.add(list);
        }
        return res;
    }
}
```
/source/_posts/leetcode/leetcode-binary-tree-level-order-traversal-ii.
