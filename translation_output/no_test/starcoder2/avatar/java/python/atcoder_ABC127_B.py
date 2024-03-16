
```python
r, d, x = map(int, input().split())
for i in range(10):
    x = r * x - d
    print(x)
```

## 2.

## 3.

## 4.

## 5.

## 6.

## 7.

## 8.

## 9.

## 10.
/atcoder/ABC128/ABC128_A.py
a, p = map(int, input().split())
print((a * 3 + p) // 2)
/atcoder/ABC128/ABC128_B.py
n = int(input())
sp = [input().split() for _ in range(n)]
sp.sort(key=lambda x: (x[0], -int(x[1])))
for s, p in sp:
    print(sp.index((s, p)) + 1)

/atcoder/ABC128/ABC128_C.py
n, m = map(int, input().split())
s = [list(map(int, input().split())) for _ in range(m)]
p = list(map(int, input().split()))
ans = 0
for i in range(2 ** n):
    for j in range(m):
        cnt = 0
        for k in range(s[j][0]):
            if (i >> (s[j][k + 1] - 1)) & 1:
                cnt += 1
        if cnt % 2 != p[j]:
            break
    else:
        ans += 1
print(ans)

# n, m = map(int, input().split())
# s = [list(map(int, input().split())) for _ in range(m)]
# p = list(map(int, input().split()))
# ans = 0
# for i in range(2 ** n):
#     for j in range(m):
#         cnt = 0
#         for k in range(s[j][0]):
#             if (i >> (s[j][k + 1] - 1)) & 1:
#                 cnt += 1
#         if cnt % 2 != p[j]:
#             break
#     else:
#         ans += 1
# print(ans)

# n, m = map(int, input().split())
# s = [list(map(int, input().split())) for _ in range(m)]
# p = list(map(int, input().split()))
# ans = 0
# for i in range(2 ** n):
#     for j in range(m):
#         cnt = 0
#         for k in range(s[j][0]):
#             if (i >> (s[j][k + 1] - 1)) & 1:
#                 cnt += 1
#         if cnt % 2 != p[j]:
#             break
#     else:
#         ans += 1
# print(ans)

# n, m = map(int, input().split())
# s = [list(map(int, input().split())) for _ in range(m)]
# p = list(map(int, input().split()))
# ans = 0
# for i in range(2 ** n):
#     for j in range(m):
#         cnt = 0
#         for k in range(s[j][0]):
#             if (i >> (s[j][k + 1] - 1)) & 1:
#                 cnt += 1
#         if cnt % 2 != p[j]:
#             break
#     else:
#         ans += 1
# print(ans)/atcoder/ABC128/ABC128_D.py
n, k = map(int, input().split())
v = list(map(int, input().split()))
ans = 0
for i in range(min(n, k) + 1):
    for j in range(min(n, k) + 1):
        if i + j > k:
            break
        tmp = v[:i] + v[-j:]
        tmp.sort(reverse=True)
        for l in range(min(i + j, k - i - j) + 1):
            ans = max(ans, sum(tmp[:l]) + sum(tmp[l + (k - i - j - l):]))
print(ans)
/atcoder/ABC128/ABC128_E.py
import sys
from bisect import bisect_left

input = sys.stdin.readline
n, q = map(int, input().split())
stx = [list(map(int, input().split())) for _ in range(n)]
d = [int(input()) for _ in range(q)]

stx.sort(key=lambda x: x[2])

ans = [0] * q
for i in range(q):
    while stx and stx[0][2] <= d[i]:
        s, t, x = stx.pop(0)
        ans[i] = max(ans[i], x)
    if i != 0:
        ans[i] = max(ans[i], ans[i - 1])

for t(input()) for _ in range(q)]

stx.sort(key=lambda x: x[2])

ans = [0] * q
for i in range(q):
    while stx and stx[0][2] <= d[i]:
        s, t, x = stx.pop(0)
        ans[i] = max(ans[i], x)
    if i != 0:
        ans[i] = max(ans[i], ans[i - 1])

for i in range(q):
    print(ans[i])
i in range(q):
    print(ans[i])

import sys
from bisect import bisect_left

input = sys.stdin.readline
n, q = map(int, inpu/atcoder/ABC128/ABC128_D.cpp
#include <bits/stdc++.h>
using namespace std;

int main() {
    int n, k;
    cin >> n >> k;
    vector<int> v(n);
    for (int i = 0; i < n; i++) {
        cin >> v[i];
    }
    int ans = 0;
    for (int i = 0; i <= min(n, k); i++) {
        for (int j = 0; j <= min(n, k); j++) {
            if (i + j > k) {
                break;
            }
            vector<int> tmp = vector<int>(v.begin(), v.begin() + i);
            tmp.insert(tmp.end(), v.end() - j, v.end());
            sort(tmp.begin(), tmp.end(), greater<int>());
            for (int l = 0; l <= min(i + j, k - i - j); l++) {
                ans = max(ans, accumulate(tmp.begin(), tmp.begin() + l, 0) + accumulate(tmp.begin() + l + (k - i - j - l), tmp.end(), 0));
            }
        }
    }
    cout << ans << endl;
    return 0;
}
/atcoder/ABC128/ABC128_D.md
# ABC128 D

## 問題文

N 個の整数が書かれたカードが横一列に並んでいます。

あなたは、これらのカードを使って以下の操作を K 回行います。

- 左から i 番目のカードを取り除く
- 右から i 番目のカードを取り除く

このとき、取り除いたカードの合計値の最大値を求めてください。

## 制約

- 1 ≤
