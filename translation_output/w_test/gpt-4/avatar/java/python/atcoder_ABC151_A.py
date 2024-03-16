Below is the translated version of the given Java code into Python:

```python
def atcoder_ABC151_A():
    s = input()
    c = s[0]
    next_c = chr(ord(c) + 1)
    print(next_c)

# Test input
atcoder_ABC151_A()
```

When you put 'c' as input, this will return 'd' as the expected output. Please note that in Python, you use the `ord` function to get the ASCII value of a character, and `chr` to convert an ASCII value back to a character. Also, there is no need to import a scanner for reading input, you can just use the `input()` function.
