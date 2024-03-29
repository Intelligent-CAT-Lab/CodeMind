s = input()
sd = "abcdefghijklmnopqrstuvwxyz"
sdnum = "0123456789"
count = [0] * 26
countnum = [0] * 10

for i in range(len(s)):
    if s[i] >= '0' and s[i] <= '9':
        countnum[ord(s[i]) - ord('0')] += 1
    if s[i] >= 'a' and s[i] <= 'z':
        count[ord(s[i]) - ord('a')] += 1

ans = 0
for i in range(26, 2, -1):
    for j in range(26 - i + 1):
        tmp = 10000
        for k in range(j, j + i):
            tmp = min(tmp, count[k])
        ans += tmp * 3
        for k in range(j, j + i):
            count[k] -= tmp
for i in range(26):
    ans += count[i]

for i in range(10, 2, -1):
    for j in range(10 - i + 1):
        tmp = 10000
        for k in range(j, j + i):
            tmp = min(tmp, countnum[k])
        ans += tmp * 3
        for k in range(j, j + i):
            countnum[k] -= tmp
for i in range(10):
    ans += countnum[i]

print(ans)