Here's the equivalent Python code for the given Java program:

```python
# no need for an import statement for basic input/output in Python

def main():
    X = int(input())  # reads the first input as an integer
    Y = int(input())  # reads the second input as an integer

    i = 0
    while X <= Y:
        i += 1
        X *= 2

    print(i)

if __name__ == "__main__":
    main()
```

In Python, the `main()` function is not mandatory, but defining it and using the `if __name__ == "__main__":` idiom allows for the possibility of importing this script as a module in another script without executing the code immediately.
