from collections import Counter

A = list(input())
a = len(A)
A = Counter(A)
cnt = 0
for i in A.values():
    if i != 1:
        cnt += i * (i - 1) // 2

print(a * (a - 1) // 2 - cnt + 1)