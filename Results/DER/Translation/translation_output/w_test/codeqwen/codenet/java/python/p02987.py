Here is the Python equivalent of the Java code:

```python
def check_string(s):
    s = sorted(s)
    if s[0] == s[1] and s[2] == s[3] and s[1] != s[2]:
        return "Yes"
    else:
        return "No"

s = input()
print(check_string(s))
```

This Python code does the same thing as the Java code. It takes a string as input, sorts it, and checks if the first two characters are the same, the second two characters are the same, and the first two characters are not the same. If all these conditions are met, it returns "Yes", otherwise it returns "No".
