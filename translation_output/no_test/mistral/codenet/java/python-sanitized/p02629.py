import sys

N = int(input())
out = ['a' for _ in range(11)]

for i in range(11):
    N -= 1
    x = N // 26
    y = N % 26
    out[i] = chr(y + ord('a'))
    if x == 0:
        break
    N = x

for i in range(10, -1, -1):
    if out[i] == chr(0):
        continue
    print(out[i], end='')