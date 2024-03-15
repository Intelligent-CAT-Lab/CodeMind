import sys

N = int(input())
A = int(input())
B = int(input())

ans = 0
for i in range(1, N+1):
    sum = 0
    for j in range(i, 0, -1):
        sum += j % 10
    if A <= sum and sum <= B:
        ans += i

print(ans)