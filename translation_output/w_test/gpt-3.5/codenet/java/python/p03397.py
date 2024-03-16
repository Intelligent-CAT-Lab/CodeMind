```python
class Solution:
    mod = int(1e9 + 7)

    def add(self, x, y):
        x += y
        if x >= self.mod:
            x -= self.mod
        return x

    def solve(self, input_string):
        s = list(input_string)
        go = [[0, 0], [2, 2], [1, 3], [2, 0], [5, 5], [4, 6], [5, 3], [8, 8], [7, 9], [8, 6]]
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
                    next_idx = go[st][0]
                    ndp[next_idx] = self.add(ndp[next_idx], dp[st])
                if c == '1' or c == '?':
                    next_idx = go[st][1]
                    ndp[next_idx] = self.add(ndp[next_idx], dp[st])
            tmp = dp
            dp = ndp
            ndp = tmp
        res = 0
        for i in range(states):
            if dp[i] == 0:
                continue
            w = win[i]
            if w == '?':
                raise AssertionError()
            if w == 'W':
                res += dp[i]

        return res % self.mod

# Test the solution with the provided sample test case
input_string = "1??00"
sol = Solution()
output = sol.solve(input_string)
print(output)
```

