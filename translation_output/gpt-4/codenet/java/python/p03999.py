Below is the translated Java code to Python code:

```python
def helper(n):
    if n == 0:
        return 1
    return 1 << (n - 1)

def main():
    s = input()
    ans = 0
    for dx in range(len(s)):
        for start in range(len(s) - dx):
            cur = int(s[start:start + dx + 1])
            ans += cur * (helper(start) * helper(len(s) - 1 - dx - start))
    print(ans)

if __name__ == "__main__":
    main()
```

This Python code performs the same operations as the original Java code. It reads a string from standard input, processes number substrings and calculates the `ans` variable, then prints the result. The `helper` function is translated to a standalone Python function that uses bit shifting to calculate the value, just like in the Java version.
