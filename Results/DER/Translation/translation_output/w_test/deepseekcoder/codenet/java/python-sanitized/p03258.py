import sys

MODULO = int(1e9 + 7)

def solve(s):
    if all(s[i] == s[i+1] for i in range(len(s) - 1)):
        return 1

    sum_s = [0]*(len(s)+1)
    for i in range(len(s)):
        sum_s[i+1] = sum_s[i]
        if s[i] == 'a':
            sum_s[i+1] += 1
        elif s[i] == 'b':
            sum_s[i+1] += 2
        else:
            raise RuntimeError()
        sum_s[i+1] %= 3

    next_s = [[0]*(len(s)+2) for _ in range(3)]
    for i in range(3):
        next_s[i][len(s)+1] = len(s)+1

    for pos in range(len(s), -1, -1):
        for i in range(3):
            next_s[i][pos] = next_s[i][pos+1]
        next_s[sum_s[pos]][pos] = pos

    total = sum_s[len(s)]
    ways = [0]*(len(s)+2)
    ways[0] = 1
    for i in range(len(s)+1):
        need = (sum_s[i] + 1) % 3
        ways[next_s[need][i]] += ways[i]
        ways[next_s[need][i]] %= MODULO
        need = (sum_s[i] + 2) % 3
        ways[next_s[need][i]] += ways[i]
        ways[next_s[need][i]] %= MODULO

    res = 0
    for i in range(1, len(s)+1):
        if sum_s[i] == total:
            res = (res + ways[i]) % MODULO

    return res

if __name__ == "__main__":
    s = sys.stdin.readline().strip()
    print(solve(s))