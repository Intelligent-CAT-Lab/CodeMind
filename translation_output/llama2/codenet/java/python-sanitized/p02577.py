import sys

s = sys.stdin.readline()

c = 0
for i in range(len(s)):
    c += ord(s[i]) - ord('0')

if c % 9 == 0:
    print("Yes")
else:
    print("No")