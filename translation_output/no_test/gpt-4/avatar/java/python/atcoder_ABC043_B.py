The equivalent Python code would look like this:

```python
def atcoder_ABC043_B():
    s = input()
    
    while '0B ' in s or '1B ' in s:
        s = s.replace('0B ', '')
        s = s.replace('1B ', '')
    
    s = s.replace(' B ', '')
    
    print(s)

# Call the function
atcoder_ABC043_B()
```

This Python code takes an input string `s`, removes occurrences of the strings '0B ' and '1B ' while they exist in the string, and then also removes occurrences of ' B '. Finally, it prints the resulting string.
