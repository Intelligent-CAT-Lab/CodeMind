Here is the Python equivalent of the Java code:

```python
def main():
    a, b = map(int, input().split())
    k = a + b
    if k % 2 == 0:
        print(k // 2)
    else:
        print("IMPOSSIBLE")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the user, adds them together, and then checks if the sum is even or odd. If it's even, it prints the sum divided by 2. If it's odd, it prints "IMPOSSIBLE".
