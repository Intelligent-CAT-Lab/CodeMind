The equivalent Python code is provided below:

```python
def main():
    str = input()
    str = str.replace("BC", "X")
    a = 0
    ans = 0
    for i in range(len(str) - 1, -1, -1):
        c = str[i]
        if c == 'X':
            a += 1
        elif c == 'A':
            ans += a
        else:
            a = 0
    print(ans)

if __name__ == "__main__":
    main()
```

Given the provided Java code, you can simply take the string input directly from the user (or test case) in Python, without the need for a FastScanner equivalent. 

The `print` statement in Python is used to output the result, just like the `p` method in the Java code. Please note that we do not need separate methods for `min` and `max` in Python, as similar built-in functions `min()` and `max()` exist. However, as they are not used in the main logic of the given problem, I did not implement these methods in the Python code.
