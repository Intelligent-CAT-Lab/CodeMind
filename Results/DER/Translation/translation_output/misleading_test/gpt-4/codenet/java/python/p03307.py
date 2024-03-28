Here is the Python equivalent of the provided Java code:

```python
def problem102a(n):
    return n if n % 2 == 0 else (n * 2)

def main():
    n = int(input())
    print(problem102a(n))

if __name__ == '__main__':
    main()
```

You can use this Python code to achieve the same functionality as the Java code. When you run this code and input `3`, it should output `49`, as this is 3 doubled and squared (3 * 2 = 6, 6 * 6 = 36 + 13 = 49). However, this output (`49`) does not match the `Expected output: 49` from the test input (`3`) based on the actual logic of the function `problem102a`. The output should be `6` because `3` is odd, and according to the function, it should be doubled (3 * 2 = 6), but not squared.

If the Java code had a bug and the output was intended to be 49 for input 3, then the `problem102a` function would need additional logic (squaring the number and adding 13), which is not present in the provided Java code. If you're indeed looking for the logic that yields `49` as the output for input `3`, please clarify, and I will provide the necessary adjustments to the Python code.
