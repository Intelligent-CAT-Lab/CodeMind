from itertools import accumulate

S = input()
N = len(S)

A = [0] + list(accumulate(1 if s == "1" else -1 for s in S))

ma = max(A)
cur = A[-1]
C = [ma - cur]
for a in reversed(A):
    cur = max(a, cur)
    C.append(ma - cur)

d, e = 0, 0
D, E = A[:], A[:]
for i, (s, c) in enumerate(zip(S, reversed(C[:-1])), 1):
    if s == '?' and c >= d + 2:
        d += 2
    if s == '?' and c >= e + 1:
        e += 2
    D[i] += d
    E[i] += e

print(min(max(D) - min(D), max(E) - min(E)))