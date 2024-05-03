Here is the Python equivalent of the Java code:

```python
def main():
    Sheep, Wolve = map(int, input().split())

    if Wolve >= Sheep:
        print("unsafe")
    else:
        print("safe")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the user, then checks if the second integer (Wolve) is greater than or equal to the first integer (Sheep). If it is, it prints "unsafe". Otherwise, it prints "safe".
