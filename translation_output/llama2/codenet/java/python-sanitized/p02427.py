import sys

n = int(sys.stdin.readline())

for i in range(1, 2**n+1):
    temp = i
    print(i, end=':')
    for j in range(1, n+1):
        if temp % 2 == 1:
            print(j, end=' ')
        temp //= 2
    print()