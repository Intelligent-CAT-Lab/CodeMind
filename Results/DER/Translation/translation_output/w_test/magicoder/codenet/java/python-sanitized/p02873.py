import sys

def solve(s):
    n = len(s)
    sum = 0
    cnt = 0
    curr = 0
    for i in range(n):
        if s[i] == '>':
            while i < n and s[i] == '>':
                i += 1
                cnt += 1
            if curr > cnt:
                sum += (curr + ((cnt * (cnt - 1)) // 2))
            else:
                sum += ((cnt + 1) * cnt // 2)
            curr = 0
            cnt = 0
        else:
            sum += curr
            curr += 1
    if s[n - 1] == '<':
        sum += curr
    return sum

if __name__ == "__main__":
    s = sys.stdin.readline().strip()
    print(solve(s))