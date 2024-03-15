Here is the equivalent Python code for the provided Java code:

```python
# No imports are necessary for basic input/output in Python

def main():
    a = int(input())  # input Integer
    b = int(input())  # input Integer
    # a = input()    # input String (commented out in Python as it is in Java)
    if a < b:
        print(0)
    else:
        print(10)

if __name__ == "__main__":
    main()
```

In Python, the `input()` function reads a string from standard input, and `int()` is used to convert that string to an integer. Unlike Java, there is no need to import a module for basic input/output functionality in Python. Additionally, I've wrapped the code in a `main()` function to more closely mimic the Java structure with its `main` method. The `if __name__ == "__main__":` idiom is used to ensure that `main()` runs when the script is executed directly.
