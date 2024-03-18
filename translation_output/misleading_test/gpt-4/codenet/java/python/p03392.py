Below is the translated Python code from the provided Java code. The `exp` function in Java has been converted to a Python function using the same logic. Note that indentation in Python is significant and serves as a replacement for braces `{}` in Java to define code blocks.

```python
def exp(base, e, mod):
    if e == 0:
        return 1
    if e == 1:
        return base
    val = exp(base, e // 2, mod)
    ans = (val * val) % mod
    if e % 2 == 1:
        ans = (ans * base) % mod
    return ans

def main():
    s = input().strip()
    n = len(s)
    abc = {"abc", "acb", "bac", "bca", "cab", "cba"}
    diff = 0
    for i in range(n - 1):
        if s[i] != s[i + 1]:
            diff += 1
    
    if n <= 2:
        if s[0] == s[1]:
            print(1)
        else:
            print(2)
    elif s in abc:
        print("3")
    elif diff == 0:
        print("1")
    else:
        mod = 998244353
        dp = [[[0] * 3 for _ in range(3)] for _ in range(n)]
        dp_no_dpl = [[[0] * 3 for _ in range(3)] for _ in range(n)]
        ans = 1
        for i in range(n - 1):
            if s[i] == s[i + 1]:
                ans = 0
        
        sum_ = 0
        for i in range(n):
            sum_ += (ord(s[i]) - ord('a'))
            sum_ %= 3
        
        dp[0][0][0] = dp[0][1][1] = dp[0][2][2] = 1
        dp_no_dpl[0][0][0] = dp_no_dpl[0][1][1] = dp_no_dpl[0][2][2] = 1
        
        for i in range(1, n):
            for j in range(3):
                dp_no_dpl[i][0][j] += dp_no_dpl[i - 1][1][(j + 3 - 0) % 3]
                dp_no_dpl[i][0][j] += dp_no_dpl[i - 1][2][(j + 3 - 0) % 3]
                dp_no_dpl[i][1][j] += dp_no_dpl[i - 1][0][(j + 3 - 1) % 3]
                dp_no_dpl[i][1][j] += dp_no_dpl[i - 1][2][(j + 3 - 1) % 3]
                dp_no_dpl[i][2][j] += dp_no_dpl[i - 1][0][(j + 3 - 2) % 3]
                dp_no_dpl[i][2][j] += dp_no_dpl[i - 1][1][(j + 3 - 2) % 3]
                
                for k in range(3):
                    dp_no_dpl[i][k][j] %= mod

        ans += exp(3, n - 1, mod) + mod
        ans -= (dp_no_dpl[n - 1][0][sum_] + dp_no_dpl[n - 1][1][sum_] + dp_no_dpl[n - 1][2][sum_]) - 3 * mod
        ans %= mod
        print(ans)


if __name__ == "__main__":
    main()
```

This Python code assumes that you will run it from the command line and enter the string as input, similar to the Java program where you read from `System.in`. Make sure to run it in an environment that allows for user input.
