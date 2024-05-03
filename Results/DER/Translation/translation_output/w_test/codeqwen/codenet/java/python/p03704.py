Here is the Python equivalent of the Java code you provided:

```python
def solve():
    D = int(input())
    ans = 0
    for len in range(len(str(D)), 19):
        ans += dfs(D, 0, len)
    print(ans)

def dfs(rem, pos, len):
    if len - pos - 1 < pos:
        return rem == 0
    if pos == len - 1 - pos:
        return rem == 0
    
    d = 1
    for i in range(1, len - pos - 1):
        d *= 10
    dm = 1
    for i in range(1, pos + 1):
        dm *= 10
    d -= dm
    if abs(rem) >= 10 * d:
        return 0
    ret = 0
    for i in range(-9, 10):
        if pos == 0 and i >= 0:
            ret += dfs(rem - d * i, pos + 1, len) * (9 - abs(i))
        else:
            ret += dfs(rem - d * i, pos + 1, len) * (10 - abs(i))
    return ret

if __name__ == "__main__":
    solve()
```

This Python code does the same thing as the Java code you provided. It reads an integer from the user, calculates the number of digits in the integer, and then recursively calculates the number of valid numbers that can be formed using the digits of the input integer. The result is then printed to the console.
