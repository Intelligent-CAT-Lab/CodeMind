```python
class p01601:

    def __init__(self):
        self.INF = 1 << 28
        # self.INF = 1 << 62
        self.EPS = 1e-10

    def run(self):
        n = int(input())
        i = 0
        while True:
            if self.isPalin(str(n - i)):
                print(n - i)
                break
            if self.isPalin(str(n + i)):
                print(n + i)
                break
            i += 1

    def isPalin(self, s):
        return s == s[::-1]

if __name__ == "__main__":
    p = p01601()
    p.run()
```
```python
# Test input handling and function invocation
p = p01601()
p.run()
```
```python
# Test case
# Test input
n = 13
# Expected output
expected_output = 11

p = p01601()
output = p.run(n)
print(output)
assert output == expected_output, f"Expected: {expected_output}, Got: {output}"
```
