Here is the Python equivalent of the provided Java code using Python's built-in `input` function for reading user input:

```python
def main():
    p = int(input())
    m = int(input())
    c = int(input())

    print(p + m + c)

if __name__ == "__main__":
    main()
```

Note that unlike Java, Python does not require explicit imports for basic input/output operations and does not have a dedicated Scanner class. The `input` function is used to read input from the standard input (typically, the keyboard), and `int()` is used to convert the input string to an integer. Additionally, Python uses indentation to define blocks of code, and it is common practice to execute the main block of code in a conditional statement `if __name__ == "__main__":` to ensure that it runs only when the script is executed directly, and not when it is imported as a module in another script.
