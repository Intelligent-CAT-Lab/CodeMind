Here's the provided Java code translated into Python. Note that in Python, we don't need a separate class for reading input; we can easily use the built-in input functions. Additionally, I've replaced the `PrintWriter` with Python's built-in print function, which is already buffered in newest Python versions:

```python
def main():
    l = int(input())
    k = int(input())
    dp = [[0]*(l+1) for _ in range(2)]
    dp[0][0] = 1
    for i in range(1, l+1):
        dp[0][i] += dp[1][i-1]
        dp[1][i] += dp[0][i-1]
        if i >= k:
            dp[1][i] += dp[0][i-k]
    ans = sum(dp[1][1:])
    print(ans)

if __name__ == "__main__":
    main()
```

Do note that in the original Java code, the input is read as consecutive integers without newlines. If the Python input follows the same format, you will have to adjust the input fetching. If you expect all the numbers on the same line separated by spaces for Python, you would adjust the input fetching like this:

```python
def main():
    l, k = map(int, input().split())
    dp = [[0] * (l+1) for _ in range(2)]
    dp[0][0] = 1
    for i in range(1, l+1):
        dp[0][i] += dp[1][i-1]
        dp[1][i] += dp[0][i-1]
        if i >= k:
            dp[1][i] += dp[0][i-k]
    ans = sum(dp[1][1:])
    print(ans)

if __name__ == "__main__":
    main()
```

This will work assuming the input is provided as a single line with values for `l` and `k` separated by a space, for example: "10 2".
