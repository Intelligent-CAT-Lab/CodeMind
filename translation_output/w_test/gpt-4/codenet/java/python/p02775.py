Here's how the provided Java code can be translated into Python:

```python
def debug(*args):
    print("DEBUG:", args)

def run():
    N = "0" + input().strip()
    l = len(N)
    
    # 0 おつり, 1 ぴったり, 2 多く
    dp = [[0] * 3 for _ in range(l + 1)]

    dp[0][0] = dp[0][2] = 1

    for i in range(1, l):
        c = int(N[i])
        dp[i][0] = min(dp[i - 1][0], dp[i - 1][2]) + 9 - c
        dp[i][1] = min(dp[i - 1][0] + 1, dp[i - 1][1]) + c
        dp[i][2] = min(dp[i - 1][0] + 1, dp[i - 1][1]) + c + 1

    # debug(dp)
    dp[l - 1][0] += 1
    print(min(dp[l - 1][0], min(dp[l - 1][1], dp[l - 1][2])))

# Test case
# input: 36
# expected output: 8
run()
```

This Python code relies on built-in functions and Python's list comprehension for array initialization. Remember that in Python we use zero-based indexing, unlike Java's one-based for arrays. Also, I created a `run()` function to encapsulate the core logic of the original `run()` method in the Java code. The `debug()` function is provided for debugging purposes, and since Python lists are directly printable, there's no need for a method like `Arrays.deepToString` used in Java's debug method.
