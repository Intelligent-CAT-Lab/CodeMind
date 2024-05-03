Here is the Python equivalent of the Java code:

```python
def main():
    n, m = map(int, input().split())

    n_comb = n * (n-1) // 2
    m_comb = m * (m-1) // 2

    print(n_comb + m_comb)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the user, calculates the combinations for each integer, and then prints the sum of these combinations. The `//` operator is used for integer division in Python, which is equivalent to `/` in Java.
