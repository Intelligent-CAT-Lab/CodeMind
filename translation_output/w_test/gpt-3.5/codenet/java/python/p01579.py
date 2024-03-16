```python
class Solution:
    def solve(self, s: str) -> int:
        n = len(s)
        count = [0] * (2 * n + 1)
        now = 0
        for i in range(n):
            if s[i] == '(':
                now += 1
            else:
                now -= 1
            count[now + n] += 1

        now = 0
        ans = 0
        for i in range(n):
            if s[i] == '(':
                now += 1
            else:
                now -= 1
            count[now + n] -= 1
            ans += count[now + n]

        return ans

# Test Input
s = "((()())())"
solution = Solution()
print(solution.solve(s))  # Expected output: 10
```
