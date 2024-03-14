import sys

def main():
    s = sys.stdin.readline().strip()
    count = [0]*26
    countnum = [0]*10

    for c in s:
        if c.isdigit():
            countnum[int(c)] += 1
        elif c.islower():
            count[ord(c) - ord('a')] += 1

    ans = 0
    for i in range(26, 2, -1):
        for j in range(26 - i + 1):
            tmp = 10000
            for k in range(j, j + i):
                tmp = min(tmp, count[k])
            ans += tmp * 3
            for k in range(j, j + i):
                count[k] -= tmp

    ans += sum(count)

    for i in range(10, 2, -1):
        for j in range(10 - i + 1):
            tmp = 10000
            for k in range(j, j + i):
                tmp = min(tmp, countnum[k])
            ans += tmp * 3
            for k in range(j, j + i):
                countnum[k] -= tmp

    ans += sum(countnum)

    print(ans)

if __name__ == "__main__":
    main()