Here is the equivalent Python code for the given Java program:
```python
def is_ok(last4):
    if "AGC" in last4:
        return False
    for i in range(3):
        chars = list(last4)
        chars[i], chars[i + 1] = chars[i + 1], chars[i]
        if "AGC" in "".join(chars):
            return False
    return True

def dfs(current, last3, N, memo, MOD, TOKENS):
    if last3 in memo[current]:
        return memo[current][last3]
    if current == N:
        return 1
    result = 0
    for c in TOKENS:
        if is_ok(last3 + c):
            result = (result + dfs(current + 1, last3[1:] + c, N, memo, MOD, TOKENS)) % MOD
    memo[current][last3] = result
    return result

def calc():
    MOD = 1000000007
    TOKENS = ["A", "C", "G", "T"]
    N = int(input())
    memo = [{} for _ in range(N + 1)]
    return dfs(0, "TTT", N, memo, MOD, TOKENS)

if __name__ == "__main__":
    print(calc())
```
You can run the python program, and it will expect an input as per the test case provided (99 in this case) and output the expected result (597534494 for this test case).

Make sure to run this code in a Python 3 environment as it utilizes Python 3 features and syntax.
