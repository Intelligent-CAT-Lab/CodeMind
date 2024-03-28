Below is the translated version of the given Java code in Python:

```python
def get_string_input():
    return input()

def main():
    s = get_string_input()
    print((s.count('o') * 100) + 700)

if __name__ == "__main__":
    main()
```

To test this code with the input `'oxo'`, the expected output is `900`, similar to the provided Java code's expected output. In Python, the `count` method is used instead of replacing and calculating the length difference as in the original Java code. The `count` method basically counts the number of occurrences of the substring 'o' in the string `s`.

Remember to input the test string `oxo` manually if you're executing the Python code in an environment without predefined test inputs.
