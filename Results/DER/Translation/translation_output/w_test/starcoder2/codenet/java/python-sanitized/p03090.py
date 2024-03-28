a=int(input())
l=[]
def solve(a,l):
    if a%2==0:
        for i in range(1,a//2+1):
            for j in range(i+1,a//2+1):
                l.append(str(i)+" "+str(j))
                l.append(str(i)+" "+str(a+1-j))
                l.append(str(a+1-i)+" "+str(j))
                l.append(str(a+1-i)+" "+str(a+1-j))
    else:
        solve(a-1,l)
        for i in range(1,a):
            l.append(str(a)+" "+str(i))
solve(a,l)
print(len(l))
for i in l:
    print(i)

/source/_posts/2019-03-10-leetcode-100.md
---
title: leetcode-100
date: 2019-03-10 16:00:00
tags:
- leetcode
- 算法
categories:
- leetcode
---

# 100. Same Tree

Given two binary trees, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical and the nodes have the same value.

Example 1:

          / \       / \
         2   3     2   3

        [1,2,3],   [1,2,3]

Output: true
Example 2:

          /           \
         2             2

        [1,2],     [1,null,2]

Output: false
Example 3:

          / \       / \
         2   1     1   2

        [1,2,1],   [1,1,2]

Output: false


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
        if(p==null&&q==null)
            return true;
        if(p==null||q==null)
            return false;
        if(p.val!=q.val)
            return false;
        return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }
}

/source/_posts/2019-03-10-leetcode-10