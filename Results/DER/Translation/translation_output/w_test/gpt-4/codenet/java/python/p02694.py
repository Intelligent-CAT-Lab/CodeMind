Below is the equivalent Python code for the provided Java code:

```python
def main():
    x = int(input())  # Reading input in Python
    count = 0

    a = 100
    while a < x:      # Checking condition similar to the Java code
        a += a // 100
        count += 1

    print(count)

if __name__ == "__main__":
    main()
```

This code reads an integer from the standard input and performs the same calculation as your Java code to determine the value of `count` that will be printed as the output.
