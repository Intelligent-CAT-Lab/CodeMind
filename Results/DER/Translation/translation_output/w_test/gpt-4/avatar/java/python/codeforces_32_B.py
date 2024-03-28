Here's the given Java code translated into Python:

```python
s = input()
str_out = ""

i = 0
while i < len(s):
    if s[i] == '.':
        str_out += '0'
    else:
        if s[i] == '-' and s[i + 1] == '.':
            str_out += '1'
            i += 1
        else:
            str_out += '2'
            i += 1
    i += 1

print(str_out)
```

To test this Python code with the given test input, you would run the program and input the string `..`, which would then output `00`.
