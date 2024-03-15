Here's the equivalent Python code for the Java program provided:

```python
def main():
    n = int(input())
    print(n, end=" ")
    m = n
    for i in range(n - 1, 0, -1):
        if m % i == 0:
            print(i, end=" ")
            m = i

if __name__ == "__main__":
    main()
```

The Python code reads an integer from standard input, just like the Java code, and then prints a sequence of integers that are divisors of `n`, decreasing by 1 until it reaches `0`. Note that in the `print` function the `end=" "` parameter is used to ensure that a space is printed after the integer, matching the output formatting of the original Java code.
