import sys

a = int(sys.stdin.readline())
b = float(sys.stdin.readline())
bb = int((100 * b) + 0.1)
ans = (a * bb) // 100
print(ans)