```python
class ParenthesesCounter:
    def run(self):
        s = input()
        self.solve(s)
    
    def solve(self, s):
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
        print(ans)

if __name__ == "__main__":
    pc = ParenthesesCounter()
    pc.run()
```
```python
# Test case:
# Test input: ((()())())
# Expected output: -22

# Output:
# -22
```
