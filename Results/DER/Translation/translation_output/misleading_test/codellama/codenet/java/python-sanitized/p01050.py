import math

def solve(s):
    sd = "abcdefghijklmnopqrstuvwxyz"
    sdnum = "0123456789"
    count = [0] * 26
    countnum = [0] * 10

    for c in s:
        if c in sd:
            count[ord(c) - ord('a')] += 1
        elif c in sdnum:
            countnum[ord(c) - ord('0')] += 1

    ans = 0
    for i in range(26, 3, -1):
        for j in range(0, 26 - i):
            tmp = 10000
            for k in range(j, j + i):
                tmp = min(tmp, count[k])
            ans += tmp * 3
            for k in range(j, j + i):
                count[k] -= tmp

    for i in range(26):
        ans += count[i]

    for i in range(10, 3, -1):
        for j in range(0, 10 - i):
            tmp = 10000
            for k in range(j, j + i):
                tmp = min(tmp, countnum[k])
            ans += tmp * 3
            for k in range(j, j + i):
                countnum[k] -= tmp

    for i in range(10):
        ans += countnum[i]

    return ans


s = "0ig3he12fz99"
print(solve(s))