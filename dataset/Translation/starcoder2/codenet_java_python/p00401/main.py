import sys

input = int(sys.stdin.readline())
ans = 1
while input >= ans*2:
    ans *= 2
print(ans)