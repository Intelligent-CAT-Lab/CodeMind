Here is the translated code from Java to Python:

```python
# No import needed for basic input in Python

def main():
    r = int(input())  # Reading the long input as int since Python can handle very large integers
    if r < 1200:
        print("ABC")
    elif r < 2800:
        print("ARC")
    else:
        print("AGC")

if __name__ == "__main__":
    main()
```

In Python, the `main` method is not required, but it is best practice to define a `main` function for readability and to encapsulate the code that should run only when the script is executed directly. The `if __name__ == "__main__":` part ensures that `main()` is called only when the script is executed as the main module and not when imported.
