Here's the Python equivalent of the Java code you provided:

```python
def main():
    cnt = int(input())
    power = 1
    for i in range(1, cnt + 1):
        power = (power * i) % (10**9 + 7)
    print(int(power))

if __name__ == "__main__":
    main()
```

In this Python translation:

- The `import` statements are not needed because Python has built-in functions for the tasks done in the Java code.
- I've created a `main` function to encapsulate the behavior of the Java `main` method.
- Instead of using `Scanner`, Python has a built-in `input` function to read from standard input. Also, `int(input())` is used to read an integer.
- The `for` loop uses `range(1, cnt + 1)` to loop from 1 to `cnt` inclusive.
- The `Math.pow(10, 9)` expression in Java has been replaced with `10**9` in Python, which is the way to express exponentiation.
- `print` is used in place of `System.out.println` to output the result to the console.
- The final cast to `int` is still used when printing `power` to ensure that the output format is the same as in the Java code. However, in the Python code, `power` will already be an integer because of the way the modulo operation is computed, so this explicit cast isn't technically necessary.
