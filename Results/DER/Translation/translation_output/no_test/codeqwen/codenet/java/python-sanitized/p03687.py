import sys

s = sys.stdin.readline().strip()
ans = 101
for i in range(26):
    target = chr(i+ord('a'))
    max_ = 0
    cur = 0
    for j in range(len(s)):
        if s[j] == target:
            cur = 0
        else:
            cur += 1
            max_ = max(max_, cur)
    ans = min(ans, max_)

print(ans)