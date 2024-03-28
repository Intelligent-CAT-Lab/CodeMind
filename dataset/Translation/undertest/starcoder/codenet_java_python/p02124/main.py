import sys

x = int(sys.stdin.readline())
ans = "ai1333"
for i in range(x//100):
	ans += "3"
print(ans)