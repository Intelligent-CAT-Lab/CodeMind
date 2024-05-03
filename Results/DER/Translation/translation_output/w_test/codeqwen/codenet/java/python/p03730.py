Here is the Python equivalent of the Java code:

```python
def main():
    a, b, c = map(int, input().split())

    for i in range(5000):
        if a * i % b == c:
            print("YES")
            return
    print("NO")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the user, then it loops from 0 to 5000. If the product of `a` and `i` is divisible by `b` with a remainder of `c`, it prints "YES" and returns. If it doesn't find such `i`, it prints "NO".
