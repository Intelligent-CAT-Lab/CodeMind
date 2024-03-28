def add(x, y, mod=(10**9 + 7)):
    x += y
    if x >= mod:
        x -= mod
    return x

def solve(s):
    go = [
        [0, 0], [2, 2], [1, 3], [2, 0], [5, 5], [4, 6],
        [5, 3], [8, 8], [7, 9], [8, 6]
    ]
    start = len(go) - 1
    win = "W?W?L?W?L?"
    states = len(win)
    dp = [0] * states
    dp[start] = 1
    ndp = [0] * states
    
    for c in s:
        ndp = [0] * states
        for st in range(states):
            if c == '0' or c == '?':
                next_st = go[st][0]
                ndp[next_st] = add(ndp[next_st], dp[st])
            if c == '1' or c == '?':
                next_st = go[st][1]
                ndp[next_st] = add(ndp[next_st], dp[st])
        dp, ndp = ndp, dp

    res = 0
    for i in range(states):
        if dp[i] == 0:
            continue
        w = win[i]
        if w == '?':
            raise AssertionError()
        if w == 'W':
            res += dp[i]
    
    return res % (10**9 + 7)

# Sample test case
input_data = "1??00"
print(solve(input_data))  # Expected output: 2