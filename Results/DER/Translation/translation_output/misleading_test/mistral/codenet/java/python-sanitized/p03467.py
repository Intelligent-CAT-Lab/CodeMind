import sys

P = 998244353

def go(s):
    if len(s) == 0:
        return 1
    if s in cache:
        return cache[s]

    ret = (1 + ord(s[0]) - ord('0')) * go(s[1:]) % P
    for k in range(1, len(s) + 1):
        buf = s[:k]
        for i in range(k):
            if s[k - 1 + i] == '0':
                buf[i] = '0'
        ret += (1 + go(buf) % P) * go(s[k * k:]) % P

    cache[s] = ret
    return ret

cache = {}

sys.stdin = open('input.txt', 'r')
sys.stdout = open('output.txt', 'w')

for s in sys.stdin:
    print(go(s.strip()))