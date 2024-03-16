import sys

#input
N = int(sys.stdin.readline())

#calculation
ans = 1
for i in range(1,N+1):
    ans *= i

#output
print(ans)