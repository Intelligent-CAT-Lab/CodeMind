s = input()
ans = 101
for i in range(26):
    target = chr(i + ord('a'))
    max = 0
    cur = 0
    for j in range(len(s)):
        if s[j] == target:
            cur = 0
        else:
            cur += 1
            max = max if max > cur else cur
    ans = ans if ans < max else max
print(ans)