Certainly! Here is the translated Python code:

```python
# No need to import anything for basic input in python.

def main():
    a = int(input())
    b = int(input())
    c = int(input())
    if (a + b + c) >= 22:
        print("bust")
    else:
        print("win")

# The 'main' method is not an entry point in Python as it is in Java.
# If we want to replicate Java behavior, we should call main() conditionally.

if __name__ == '__main__':
    main()
```

Note that Python uses indentation instead of curly braces to define blocks of code. Also, `input()` is used to take input from the user instead of creating a `Scanner` object, and you have to explicitly cast the input to an integer with `int()` since `input()` returns a string by default. In Python, the `if __name__ == '__main__':` construct means that `main()` will only execute if the script is run as the main file, similar to running a Java class containing a `main` method.
