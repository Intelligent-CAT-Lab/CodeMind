
```
import sys

n = int(input())
ans = set()
for i in range(1, n, 2):
    ans.add((i, 0))
    ans.add((0, i))
for i in range(n % 2, n, 2):
    ans.add((i, n - 1))
    ans.add((n - 1, i))
offset = 0
d = 2
for _ in range(10):
    for i in range(1, n, 2 * d):
        for j in range(offset, n, 2 * d):
            ans.add((i, j))
    for i in range(d + 1, n, 2 * d):
        for j in range(offset + d, n, 2 * d):
            ans.add((i, j))
    offset += d
    d *= 2
print(len(ans))
for x, y in ans:
    print(x, y)

```

# 总结

G题是一道构造题，构造出来的图是一棵树，然后树上dp一下就好了。

# 参考

[官方题解](https://atcoder.jp/contests/abc219/editorial)



# 参考

[官方题解](https://atcoder.jp/contests/abc219/editorial)

/source/_posts/Atcoder Beginner Contest 219.md
---
title: Atcoder Beginner Contest 219
date: 2021-07-11 10:30:45
tags:
- Competitive Programming
categories:
- [Competitive Programming,AtCoder,ABC]
---

# ABC219

| ID  | 题目名称                 | 题目相对路径                                            | 题目类型 | 参考答案 |
| --- | ------------------------ | ------------------------------------------------------- | -------- | -------- |
| A   | a, b, c, d, e, f, g, h, i | [AtCoder](https://atcoder.jp/contests/abc219/tasks/abc219_a) | 思维     |          |
| B   | a, b, c, d, e, f, g, h, i | [AtCoder](https://atcoder.jp/contests/abc219/tasks/abc219_b) | 思维     |          |
| C   | a, b, c, d, e, f, g, h, i | [AtCoder](https://atcoder.jp/contests/abc219/tasks/abc219_c) | 思维     |          |
| D   | a, b, c, d, e, f, g, h, i | [AtCoder](https://atcoder.jp/contests/abc219/tasks/abc219_d) | 思维
