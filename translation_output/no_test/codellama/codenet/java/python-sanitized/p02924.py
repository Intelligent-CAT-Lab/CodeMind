import sys

n = int(sys.stdin.readline().strip())
result = 0
for i in range(n - 1, 0, -1):
    result += i

print(result)