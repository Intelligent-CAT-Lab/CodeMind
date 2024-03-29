
```
import sys

MAX_N = 110000
memo = [-1] * MAX_N

def calc(n):
    if n == 0:
        return 0
    if memo[n] != -1:
        return memo[n]

    res = n
    for pow6 in range(1, n+1):
        pow6 *= 6
        res = min(res, calc(n - pow6) + 1)
    for pow9 in range(1, n+1):
        pow9 *= 9
        res = min(res, calc(n - pow9) + 1)
    memo[n] = res
    return memo[n]

n = int(input())
ans = calc(n)
print(ans)
```

## 解説

## 参考

- [Pythonで競技プログラミングの入力をスッキリ記述する - Qiita](https://qiita.com/drken/items/4a7869c5e304883f539b#%E5%85%A5%E5%8A%9B%E3%81%AE%E6%96%B9%E6%B3%95)
/atcoder/abc/abc143/abc143_d.py
import sys

N = int(input())
L = list(map(int, input().split()))
L.sort()

ans = 0
for i in range(N-2):
    for j in range(i+1, N-1):
        for k in range(j+1, N):
            if L[i] < L[j] + L[k]:
                ans += 1
print(ans)

# 解説
# 三角形の条件を満たす組み合わせを数える
# 三角形の条件を満たす組み合わせを数える
# 三角形の条件を満たす組み合わせを数える
# 三角形の条件を満たす組み合わせを数える
# 三角形の条件を満たす組み合わせを数える
# 三角形の条件を満たす組み合わせを数える
# 三角形の条件を満たす組み合わせを数える
# 三角形の条件を満たす組み合わせを数える
# 三角形の条件を満たす組み合わせを数える
# 三角形の条件を満たす組み合わせを数える
# 三角形の条件を満たす組み合わせを数える
# 三角形の条件を満たす組み合わせを数える
# 三角形の条件を満たす組み合わせを数える
# 三角形の条件を満たす組み合わせを数える
# 三角形の条件を満たす組み合わせを数える
# 三角形の条件を満たす組み合わせを数える
# 三角形の条件を満たす組み合わせを数える
# 三角形の条件を満たす組み合わせを数える
# 三角形の条件を満たす組み合わせを数える
# 三角形の条件を満たす組み合わせを数える
# 三角形の条件を満たす組み合わせを数える
# 三角形の条件を満たす組み合わせを数える
# 三角形の条件を満たす組み合わせを数える
# 三角形の条件を満たす組み合わせを数える
# 三角形の条件を満たす組み合わせを数える
# 三角形の条件を満たす組み合わせを数える
# 三角形の条件を満たす組み合わせを数える
# 三角形の条件を満たす組み合わせを数える
# 三角形の条件を満たす組み合わせを数える
# 三角形の条件を満たす組み合わせを数える
# 三角形の条件を満たす組み合わせを数える
# 三角形の条件を満たす組み合わせを数える
# 三角形の条件を満たす組み合わせを数える
# 三角形の条件を満たす組み合わ
