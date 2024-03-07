import sys

s = sys.stdin.readline().strip()
c = 0
for i in range(len(s)):
    c += int(s[i])
if c % 9 == 0:
    print("Yes")
else:
    print("No")