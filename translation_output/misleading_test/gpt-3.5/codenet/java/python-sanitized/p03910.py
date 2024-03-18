from collections import defaultdict
import sys
input = sys.stdin.readline

N = int(input())
table = [0] * (N+1)
table[0] = 0
M = 0

for i in range(1, N+1):
    table[i] = table[i-1] + i
    if table[i] >= N:
        M = i
        break

s = set(range(1, M+1))
s.discard(table[M]-N)

for a in s:
    print(a)