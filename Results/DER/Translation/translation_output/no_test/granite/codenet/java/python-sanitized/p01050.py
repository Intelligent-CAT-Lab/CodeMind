import sys

s = input()
count = [0] * 26
countnum = [0] * 10

for c in s:
    if c.isdigit():
        countnum[int(c)] += 1
    elif c.isalpha():
        count[ord(c) - ord('a')] += 1

ans = 0
for i in range(23, 2, -1):
    for j in range(26 - i + 1):
        tmp = 10000
        for k in range(i):
            tmp = min(tmp, count[j + k])
        ans += tmp * 3
        for k in range(i):
            count[j + k] -= tmp

for i in range(26):
    ans += count[i]

for i in range(8, 1, -1):
    for j in range(10 - i + 1):
        tmp = 10000
        for k in range(i):
            tmp = min(tmp, countnum[j + k])
        ans += tmp * 3
        for k in range(i):
            countnum[j + k] -= tmp

for i in range(10):
    ans += countnum[i]

print(ans)