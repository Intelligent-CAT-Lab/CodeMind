import sys
import io
import math

MOD = 1_000_000_007
inf = sys.maxsize // 2

def solve():
    n = ni()
    x = ni()
    y = ni()
    z = ni()
    sum = x+y+z+1
    mask = 1<<sum
    mask -= 1
    dp = [[0]*(mask+1) for _ in range(n+1)]
    ng = 0
    ng |= 1<<z
    ng |= 1<<(y+z)
    ng |= 1<<(x+y+z)
    dp[0][1] = 1
    for i in range(n):
        for state in range(mask+1):
            for j in range(1, 11):
                res = ((state<<j)&mask) + 1
                if(res&ng)==ng: continue
                dp[i+1][res] += dp[i][state]
                dp[i+1][res] %= MOD
    ans = 1
    for i in range(n):
        ans *= 10
        ans %= MOD
    for i in range(mask+1):
        ans -= dp[n][i]
        ans %= MOD
    print((ans+MOD)%MOD)

def run():
    global INPUT
    INPUT = ""
    sys.stdout = io.TextIOWrapper(sys.stdout.buffer, encoding='utf-8')
    if INPUT:
        sys.stdin = io.StringIO(INPUT)
    else:
        sys.stdin = sys.__stdin__
    sys.stdout = sys.__stdout__
    solve()

def main():
    run()

def readByte():
    global lenbuf, ptrbuf, inbuf
    if lenbuf == -1:
        raise ValueError()
    if ptrbuf >= lenbuf:
        ptrbuf = 0
        lenbuf = sys.stdin.readinto(inbuf)
        if lenbuf <= 0:
            return -1
    return inbuf[ptrbuf]

def skip():
    b = read