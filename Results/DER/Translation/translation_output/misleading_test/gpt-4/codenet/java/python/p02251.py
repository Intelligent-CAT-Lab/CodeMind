Here is the given Java code translated into Python:

```python
class p02251:
    def solve(self, n):
        ans = 0
        
        # 25 cents
        ans += n // 25
        n %= 25
        
        # 10 cents
        ans += n // 10
        n %= 10
        
        # 5 cents
        ans += n // 5
        n %= 5
        
        # 1 cent
        ans += n

        return ans

# Test input
test_input = 100

# Expected output: 82
solution = p02251()
print(solution.solve(test_input))
```

Please note: The methods for input/output (`nextInt`, `nextLong`, etc.) and some utility methods (`max`, `min`, etc.) in the Java code are not necessary because Python has built-in functions to handle most of these operations. The `solve` method is the core logic here, which has been translated into Python.

To use this with actual input in Python, you could replace `test_input` with calls to `input()` to capture user input and then convert it to an integer with `int(input())`.
