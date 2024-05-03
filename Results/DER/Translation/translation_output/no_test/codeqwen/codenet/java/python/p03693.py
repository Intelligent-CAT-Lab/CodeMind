Here is the Python equivalent of the Java code:

```python
def main():
    r = int(input()) * 100
    g = int(input()) * 10
    b = int(input())

    sum = r + g + b
    print("YES" if sum % 4 == 0 else "NO")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the user, multiplies each by its respective factor (100 for red, 10 for green, and 1 for blue), adds them together, and then checks if the sum is divisible by 4. If it is, it prints "YES"; otherwise, it prints "NO".
