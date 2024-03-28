import sys

def solve(s):
    n = len(s)
    count = 0
    for i in range(n):
        count += 1
        if i + 1 >= n:
            break
        if s[i] == s[i + 1]:
            if i + 2 >= n:
                break
            i += 2
            count += 1
    return count

s = sys.stdin.readline().strip()
print(solve(s))