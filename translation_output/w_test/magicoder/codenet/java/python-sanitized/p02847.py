import sys

days = ["MON", "TUE", "WED", "THU", "FRI","SAT","SUN"]
inp = sys.stdin.readline().strip()
idx = days.index(inp)
ans = ((6-idx+7)%7)
if ans == 0:
    print(7)
else:
    print(ans)