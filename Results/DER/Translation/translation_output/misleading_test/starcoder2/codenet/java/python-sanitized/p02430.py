import sys

n, k = map(int, input().split())

for bit in range(1 << n):
    if bin(bit).count('1') != k:
        continue
    print(bit, end=':')
    for j in range(n):
        if (bit >> j) & 1 == 1:
            print(j, end=' ')
    print()