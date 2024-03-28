import sys

a = int(input())
b = int(input())
k = a + b
if k % 2 == 0:
    print(k // 2)
else:
    print("IMPOSSIBLE")