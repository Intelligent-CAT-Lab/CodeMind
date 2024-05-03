Here is the Python equivalent of the Java code:

```python
def main():
    left = sum(int(input()) for _ in range(2))
    right = sum(int(input()) for _ in range(2))
    if left > right:
        print("Left")
    elif left == right:
        print("Balanced")
    else:
        print("Right")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the user, adds them together, and then compares the sum to the next two integers. If the sum is greater, it prints "Left". If the sum is equal, it prints "Balanced". If the sum is less, it prints "Right".
