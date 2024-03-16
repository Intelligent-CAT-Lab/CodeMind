Here is the translated Python code:

```python
def main():
    n = int(input())
    p = int(input())
    if n == 1:
        print(p)
        return

    res = 1
    i = 2
    while i ** n <= p:
        if p % (i ** n) == 0:
            res = i
        i += 1

    print(res)

if __name__ == "__main__":
    main()
```

Please note that in Python, we use the `**` operator for exponentiation instead of `Math.pow`. Also, we don't specify types for variables; Python is dynamically typed. Input is handled by the `input()` function and by default provides a string, which is then converted to an integer with `int()`. The `print()` function is used to output to the console. Variables and functions use snake_case by convention, but for consistency with the original variable names, I left them as is (e.g., `res`, `i`).
