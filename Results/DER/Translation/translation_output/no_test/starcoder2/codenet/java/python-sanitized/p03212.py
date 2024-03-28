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