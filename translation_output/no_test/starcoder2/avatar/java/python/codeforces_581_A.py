
```
a, b = map(int, input().split())
count = 0
while a > 0 and b > 0:
    count += 1
    a -= 1
    b -= 1
ans = a // 2 + b // 2
print(count, ans)
```

## 581B

### 题目描述

You are given an array a consisting of n integers.

You have to process q queries. Each query is described by two integers li and ri (1 ≤ li ≤ ri ≤ n). For each query, you have to find the maximum number of consecutive equal elements in the subsegment al, l + 1, ..., ri.

### 输入格式

The first line contains integer n (1 ≤ n ≤ 105) — the number of elements in the array.

The second line contains n integers a1, a2, ..., an (1 ≤ ai ≤ 105) — the elements of the array.

The third line contains integer q (1 ≤ q ≤ 105) — the number of queries.

Each of the next q lines contains two integers li and ri (1 ≤ li ≤ ri ≤ n) — the description of the queries.

### 输出格式

Print q lines. The i-th line should contain the answer to the i-th query.

### 输入样例

```
5
1 2 2 1 1
3
1 5
2 4
3 5
```

### 输出样例

```
5
3
2
```

### 题目分析

这道题目是一道区间查询的题目，我们可以用一个数组来记录每个位置的最大连续相同元素的个数，然后对于每个查询，我们只需要输出这个数组在区间内的最大值即可。

### 代码

```
n = int(input())
a = list(map(int, input().split()))
q = int(input())

max_num = [0] * n
max_num[0] = 1
for i in range(1, n):
    if a[i] == a[i - 1]:
        max_num[i] = max_num[i - 1] + 1
    else:
        max_num[i] = 1

for i in range(q):
    l, r = map(int, input().split())
    print(max(max_num[l - 1:r]))
```

## 581C

### 题目描述

You are given n cities and m roads between them. Each road connects two cities and has a length.

You are also given k special cities.

You have to choose a subset of special cities (possibly empty) and build a road between each pair of chosen cities. The length of the road between two cities is equal to the sum of lengths of the roads between them.

Your task is to find the minimum possible length of the roads you have to build.

### 输入格式

The first line contains three integers n, m and k (1 ≤ n ≤ 105, 0 ≤ m ≤ 105, 1 ≤ k ≤ n) — the number of cities, the number of roads and the number of special cities.

The next m lines contain the description of the roads. The i-th line contains three integers ai, bi and ci (1 ≤ ai, bi ≤ n, ai ≠ bi, 1 ≤ ci ≤ 109) — the numbers of cities connected by the i-th road and the length of the road.

The next line contains k distinct integers — the numbers of special cities. The numbers are given in arbitrary order.

### 输出格式

Print a single integer — the minimum possible length of the roads you have to build.

### 输入样例

```
4 4 2
1 2 1
2 3 2
3 4 3
4 1 4
1 4
```

### 输出样例

```
10
```

### 题目分析

这道题目是一道最小生成树的题目，我们可以用Prim算法来解决。

### 代码

```
n, m, k = map(int, input().split())

graph = [[0] * n for _ in range(n)]
for i in range(m):
    a, b, c = map(int, input().split())
    graph[a - 1][b - 1] = c
    graph[b - 1][a - 1] = c

special_cities = list(map(int, input().split()))

visited = [False] * n
visited[special_cities[0] - 1] = True

min_cost = 0
for i in range(1, k):
    min_cost += graph[special_cities[i - 1] - 1][special_cities[i] - 1]
    visited[special_cities[i] - 1] = True

while True:
    min_cost_index = -1
    min_cost_value = 10 ** 9
    for i in range(n):
        if visited[i]:
            for j in range(n):
                if not visited[j] and graph[i][j] < min_cost_value:
                    min_cost_value = graph[i][j]
                    min_cost_index = j
    if min_cost_index == -1:
        break
    min_cost += min_cost_value
    visited[min_cost_index] = True

print(min_cost)
```
/source/_posts/2019-03-10-leetcode-100.md
---
title: LeetCode 100. Same Tree
date: 2019-03-10 16:00:00
categories:
- [LeetCode]
tags:
- LeetCode
- 树
- 递归
- 算法
---

# 题目描述

Given two binary trees, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical and the nodes have the same value.

<!-- more -->

# 示例

```
Input:     1         1
          / \       / \
         2   3     2   3

        [1,2,3],   [1,2,3]

Output: true
```

```
Input:     1         1
          /           \
         2             2

        [1,2],     [1,null,2]

Output: false
```

```
Input:     1         1
          / \       / \
         2   1     1   2

        [1,2,1],   [1,1,2]

Output: false
```

# 题目分析

这道题目是一道比较简单的题目，我们只需要递归的比较两个树的节点值即可。

# 代码

```
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
/source/_posts/2019-03-10-leetcode-101.md
---
title: LeetCode 101. Symmetric Tree
