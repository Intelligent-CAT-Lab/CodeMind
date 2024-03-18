mod = 10**9 + 7

def add(x, y):
    x += y
    if x >= mod:
        x -= mod
    return x

def solve(input_str):
    go = [[0, 0], [2, 2], [1, 3], [2, 0], [5, 5], [4, 6], [5, 3], [8, 8], [7, 9], [8, 6]]
    start = len(go) - 1
    win = "W?W?L?W?L?"
    states = len(win)
    dp = [0] * states
    dp[start] = 1
    ndp = [0] * states
    
    for c in input_str:
        for i in range(states):
            if c == '0' or c == '?':
                next_state = go[i][0]
                ndp[next_state] = add(ndp[next_state], dp[i])
            if c == '1' or c == '?':
                next_state = go[i][1]
                ndp[next_state] = add(ndp[next_state], dp[i])
        
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

    return res % mod

# Test input
input_str = "1??00"
output = solve(input_str)
print(output)