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


<!-- more -->

# Solution