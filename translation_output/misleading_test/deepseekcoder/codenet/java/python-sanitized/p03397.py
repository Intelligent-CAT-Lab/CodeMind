import sys

mod = int(1e9 + 7)

def add(x, y):
    x += y
    if x >= mod:
        x -= mod
    return x

def solve(s):
    go = [[0, 0], [2, 2], [1, 3], [2, 0], [5, 5], [4, 6], [5, 3], [8, 8], [7, 9], [8, 6]]
    start = len(go) - 1
    win = "W?W?L?W?L?"
    states = len(win)
    dp = [0]*states
    dp[start] = 1
    ndp = [0]*states
    for c in s:
        ndp = [0]*states
        for st in range(states):
            if c == '0' or c == '?':
                next = go[st][0]
                ndp[next] = add(ndp[next], dp[st])
            if c == '1' or c == '?':
                next = go[st][1]
                ndp[next] = add(ndp[next], dp[st])
        dp, ndp = ndp, dp
    res = 0
    for i in range(states):
        if dp[i] == 0:
            continue
        w = win[i]
        if w == '?':
            raise AssertionError()
        if w == 'W':
            res = add(res, dp[i])
    print(res)

def run():
    s = input()
    solve(s)

def main():
    run()

if __name__ == "__main__":
    main()