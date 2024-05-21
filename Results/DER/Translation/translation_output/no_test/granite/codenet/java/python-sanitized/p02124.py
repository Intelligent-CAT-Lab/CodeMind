import sys

ans = "ai1333"
x = int(sys.stdin.read())
for i in range(x // 100):
    ans += "3"
print(ans)