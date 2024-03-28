import sys

P = 1_000_000_007

def inv_mod(x, p):
    # Calculate modular inverse using Fermat's little theorem for prime p.
    return pow(x, p - 2, p)

def solve():
    n = int(next_token())

    dp = [1, 0, 0]
    inv = [0] * (n + 7)
    inv[1] = 1
    for x in range(2, len(inv)):
        inv[x] = P - (P // x) * inv[P % x] % P

    coef = 1
    ret = 0
    for k in range(1, n + 1):
        nxt = [0] * 3
        for j1 in range(3):
            for j2 in range(3):
                if j1 != j2:
                    nxt[j2] += dp[j1]
                    if nxt[j2] >= P:
                        nxt[j2] -= P
        
        dp = nxt
        
        coef = coef * (n - k + 1) % P * inv[k] % P
        
        ways = dp[1] * coef % P
        
        delta = inv[3] * inv[n] * inv[k] % P * ways % P
        
        ret += delta

    ret %= P

    for i in range(1, n):
        ret = ret * inv[3] % P

    print(ret)

def main():
    global br, eof, st
    br = sys.stdin
    eof = False
    st = None
    solve()

def next_token():
    global br, eof, st
    while st is None or not st:
        try:
            st = br.readline().strip().split()
        except:
            eof = True
            return None
    return st.pop(0)

def next_int():
    return int(next_token())

def next_long():
    return long(next_token())

if __name__ == '__main__':
    main()