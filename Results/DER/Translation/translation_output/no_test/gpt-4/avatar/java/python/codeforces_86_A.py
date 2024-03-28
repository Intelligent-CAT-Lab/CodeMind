Here's the translated Python code snippet:

```python
def power(a):
    res = 0
    while a > 0:
        res += 1
        a = a // 10
    return res

def mult(a):
    pow = power(a)
    max = 0
    for j in range(pow):
        max = max * 10 + 9
    return a * (max - a)

def main():
    l = int(input())
    r = int(input())
    res = 0
    maxxes = [0] * 10
    temp = 0
    for i in range(10):
        temp = temp * 10 + 9
        maxxes[i] = temp // 2 * (temp - temp // 2)
    res = max(mult(l), res)
    res = max(mult(r), res)
    temp = 0
    for i in range(10):
        temp = temp * 10 + 9
        if l <= temp // 2 <= r:
            res = max(maxxes[i], res)
    print(res)

if __name__ == "__main__":
    main()
```

Explanation of changes:

- Java 'long' type was replaced with Python's built-in integer type which does not have a fixed size.
- The `Scanner` object used for input in Java has been replaced with Python's `input()`.
- Division in Python "//" is used since we want floor division (discard the fractional part).
- Loops and functions are defined differently in Python than in Java.
- 'print()' in Python is used instead of 'System.out.println()' in Java.
- The `codeforces_86_Arrays` import does not seem to be a standard Java library or used in the provided code, so it's omitted in the Python translation.
- The 'max' function in Python replaces the `Math.max()` method from Java.
- There is no need to indicate the variable type in Python, type inference is automatic.
- The main method structure is slightly different in Python, and the `if __name__ == "__main__":` idiom is used in Python to ensure the main code block runs only when the script is executed directly, not when it's imported as a module.
- 'public', 'static', 'import', 'class', and other Java-specific keywords are omitted as they are not needed in the Python context.
