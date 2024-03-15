import sys

def input():
    global br, st
    br = sys.stdin
    st = sys.stdin.readline().strip().split()

def next():
    global st
    while st == None or not st.hasmoretokens():
        try:
            st = sys.stdin.readline().strip().split()
        except:
            pass
    return st[0]

def next_int():
    return int(next())

def next_long():
    return long(next())

def next_double():
    return float(next())

def next_line():
    return sys.stdin.readline().strip()

l = int(input())
k = int(input())

dp = [[1] * (l+1) for _ in range(2)]

for i in range(1, l+1):
    dp[0][i] += dp[1][i-1]
    dp[1][i] += dp[0][i-1]
    if i >= k:
        dp[1][i] += dp[0][i-k]

ans = 0
for i in range(1, l+1):
    ans += dp[1][i]

print(ans)