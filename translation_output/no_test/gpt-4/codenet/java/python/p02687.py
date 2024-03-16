The Java code you provided reads a string from standard input and then prints "ARC" if the string is "ABC"; otherwise, it prints "ABC". Here's how you can write similar functionality in Python:

```python
def main():
    s = input()
    print("ARC" if s == "ABC" else "ABC")

if __name__ == "__main__":
    main()
```

In this Python code, we define a main function that uses the `input()` function to read a string from standard input (which is the equivalent of `Scanner(System.in)` in Java). We then print the result of a conditional expression that checks if the string equals "ABC" and prints "ARC" if true, otherwise "ABC". Finally, we check if the script is being run directly and call the `main()` function if it is. The constant `MOD` from the original Java code is not used in this translation, as it doesn't impact the logic for this specific task.
