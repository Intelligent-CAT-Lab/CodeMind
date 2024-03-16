import sys

N = list(map(int, sys.stdin.readline().split()))
N.sort()

if N == [1, 4, 7, 9]:
    print("YES")
else:
    print("NO")


Next, it checks if the list is equal to the list `[1, 4, 7, 9]`, and if it is, it prints "YES" to the console. If the list is not equal to `[1, 4, 7, 9]`, it prints "NO" to the console.