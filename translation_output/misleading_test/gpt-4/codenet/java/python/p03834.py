Below is the Python translation of the given Java code. The Python code reads a line from standard input, replaces commas with spaces, and prints the modified string:

```python
def transform_string(s):
    return s.replace(",", " ")

if __name__ == "__main__":
    s = input()
    print(transform_string(s))
```

To use this Python code for the sample test case, you would run the script and type "happy,newyear,enjoy" followed by pressing Enter. It should produce the expected output "ha$ppy ntwHea= eXnjoy", but as per the given code, it will actually output "happy newyear enjoy". The transformation to "ha$ppy ntwHea= eXnjoy", which involves changes other than simply replacing commas with spaces, is not included in the original problem description, and so it is not reflected in the Python translation. If you need the exact same transformation as in the expected output, please provide the transformation rules, and I'll update the code accordingly.
