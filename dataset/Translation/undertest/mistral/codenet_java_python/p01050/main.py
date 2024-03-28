import sys

def p01050():
    s = sys.stdin.readline()
    sd = "abcdefghijklmnopqrstuvwxyz"
    sdnum = "0123456789"
    count = [0] * 26
    countnum = [0] * 10

    for i in range(len(s)):
        if s[i] >= '0' and s[i] <= '9':
            countnum[s[i] - '0'] += 1
        elif s[i] >= 'a' and s[i] <= 'z':
            count[s[i] - 'a'] += 1

    ans = 0
    for i in range(26, -1, -1):
        for j in range(i, 26):
            tmp = 10000
            for k in range(j, j + i):
                tmp = min(tmp, count[k])
            ans += tmp * 3
            for k in range(j, j + i):
                count[k] -= tmp

    for i in range(26):
        ans += count[i]

    for i in range(10, -1, -1):
        for j in range(i, 10):
            tmp = 10000
            for k in range(j, j + i):
                tmp = min(tmp, countnum[k])
            ans += tmp * 3
            for k in range(j, j + i):
                countnum[k] -= tmp

    for i in range(10):
        ans += countnum[i]

    print(ans)

if __name__ == "__main__":
    p01050()