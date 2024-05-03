Here is the Python equivalent of the Java code:

```python
def main():
    a, b = map(int, input().split())
    print(b % a == 0 and a + b or b - a)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the user, checks if the second integer is divisible by the first, and then prints the sum or difference accordingly.
