Here is the Python equivalent of the Java code:

```python
def main():
    a = [int(input()) for _ in range(3)]
    if a[0] == 1 and a[1] == 1:
        print("Open")
    elif a[2] == 1:
        print("Open")
    else:
        print("Close")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the user, stores them in a list, and then checks if the first two numbers are both 1. If they are, it prints "Open". If the third number is 1, it also prints "Open". If none of these conditions are met, it prints "Close".
