class main:
    import sys
    
    def add(x, y):
        x += y
        if x >= 1000000007:
            x -= 1000000007
        return x
    
    def solve():
        s = input()
        go = [
            [0, 0],
            [2, 2],
            [1, 3],
            [2, 0],
            [5, 5],
            [4, 6],
            [5, 3],
            [8, 8],
            [7, 9],
            [8, 6]
        ]
        start = len(go) - 1
        win = "W?W?L?W?L?"
        states = len(win)
        dp = [0] * states
        dp[start] = 1
        ndp = [0] * states
        for c in s:
            ndp[:] = [0] * states
            for st in range(states):
                if c == '0' or c == '?':
                    next = go[st][0]
                    ndp[next] = add(ndp[next], dp[st])
                if c == '1' or c == '?':
                    next = go[st][1]
                    ndp[next] = add(ndp[next], dp[st])
        tmp = dp[:]
        dp[:] = ndp[:]
        ndp[:] = tmp[:]
        res = 0
        for i in range(states):
            if dp[i] == 0:
                continue
            w = win[i]
            if w == '?':
                continue
            if w == 'W':
                res += dp[i]
        print(res % 1000000007)
    
    if __name__ == "__main__":
        solve()