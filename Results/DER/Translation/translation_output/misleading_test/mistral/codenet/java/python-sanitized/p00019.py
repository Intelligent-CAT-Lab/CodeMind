# input
import sys

# calculation
ans = 1
for N in range(2, int(sys.stdin.readline())+1):
    ans *= N

# output
print(ans)