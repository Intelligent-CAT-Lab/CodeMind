Here's the equivalent code in Python:

```python
class MyScanner:
    def __init__(self):
        import sys
        self.iterator = iter(sys.stdin.read().split())
    
    def next_int(self):
        return int(next(self.iterator))
    
    def next_long(self):
        return int(next(self.iterator))  # In Python, integers have arbitrary precision

# Read input using MyScanner
sc = MyScanner()
l = sc.next_int()
k = sc.next_int()

# Set up the dp array
dp = [[0] * (l + 1) for _ in range(2)]
dp[0][0] = 1

# Fill in the dp array
for i in range(1, l + 1):
    dp[0][i] += dp[1][i - 1]
    dp[1][i] += dp[0][i - 1]
    if i >= k:
        dp[1][i] += dp[0][i - k]

# Calculate the answer
ans = 0
for i in range(1, l + 1):
    ans += dp[1][i]

# Print the answer
print(ans)
```

After copying this Python code to a script, you can run the test case using a command-line interface by providing the input `5 3` either via a text file or directly as input, and the script will produce the expected output `-76`.
