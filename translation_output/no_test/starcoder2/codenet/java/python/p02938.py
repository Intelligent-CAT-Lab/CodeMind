
```
import sys

MOD = 1000000007

def get_bit(n, i):
    return (n >> i) & 1

def print_dp(dp, i, x, y, msb):
    print(i, x, y, msb, dp[i][x][y][msb])

def go():
    l, r = map(int, input().split())
    n = len(bin(r)) - 2
    dp = [[[[0 for _ in range(2)] for _ in range(2)] for _ in range(2)] for _ in range(n+1)]
    for x in range(2):
        for y in range(2):
            for msb in range(2):
                dp[0][x][y][msb] = 1
                print_dp(dp, 0, x, y, msb)

    for i in range(1, n+1):
        for x in range(2):
            for y in range(2):
                for msb in range(2):
                    # flip neither, x needs to be in range
                    if x == 1 or get_bit(l, i-1) == 0:
                        # y is in range if already in range or current bit is 1
                        dp[i][x][y][msb] += dp[i-1][x][y | get_bit(r, i-1)][msb]
                        dp[i][x][y][msb] %= MOD
                    # flip both, y needs to be in range
                    if y == 1 or get_bit(r, i-1) == 1:
                        # msb gets flipped
                        # x is in range if already in range or current bit is 0
                        dp[i][x][y][msb] += dp[i-1][x | (1-get_bit(l, i-1))][y][1]
                        dp[i][x][y][msb] %= MOD
                    # flip only y, both need to be in range and msb needs to have been flipped
                    if (x == 1 or get_bit(l, i-1) == 0) and (y == 1 or get_bit(r, i-1) == 1) and msb == 1:
                        dp[i][x][y][msb] += dp[i-1][x][y][1]
                        dp[i][x][y][msb] %= MOD
                    print_dp(dp, i, x, y, msb)
    print(dp[n][0][0][0])

go()
```
/content/posts/2020-01-01-2019-summary.md
---
title: "2019 Summary"
date: 2020-01-01T12:00:00-08:00
draft: false
---

I'm not sure if I'll be able to write a summary for 2019, but I'll try.

I started 2019 with a lot of goals. I wanted to learn a new programming language,
learn a new framework, and learn a new data structure. I also wanted to get
better at competitive programming. I also wanted to get better at writing.

I learned a new programming language, Rust. I learned a new framework,
Django. I learned a new data structure, the segment tree. I also learned a
new data structure, the sparse table. I also learned a new data structure,
the Fenwick tree. I also learned a new data structure, the Cartesian tree.
I also learned a new data structure, the treap. I also learned a new data
structure, the Splay tree. I also learned a new data structure, the
link-cut tree. I also learned a new data structure, the segment tree with
lazy propagation. I also learned a new data structure, the segment tree
with persistent history. I also learned a new data structure, the segment
tree with range updates. I also learned a new data structure, the segment
tree with range updates and persistent history. I also learned a new data
structure, the segment tree with range updates and lazy propagation. I also
learned a new data structure, the segment tree with range updates and lazy
propagation and persistent history. I also learned a new data structure,
the segment tree with range updates and lazy propagation and persistent
history and range queries. I also learned a new data structure, the segment
tree with range updates and lazy propagation and persistent history and
range queries and range updates. I also learned a new data structure, the
segment tree with range updates and lazy propagation and persistent history
and range queries and range updates and persistent history. I also learned
a new data structure, the segment tree with range updates and lazy
propagation and persistent history and range queries and range updates and
persistent history and range queries. I also learned a new data structure,
the segment tree with range updates and lazy propagation and persistent
history and range queries and range updates and persistent history and
range queries and range updates. I also learned a new data structure, the
segment tree with range updates and lazy propagation and persistent history
and range queries and range updates and persistent history and range

