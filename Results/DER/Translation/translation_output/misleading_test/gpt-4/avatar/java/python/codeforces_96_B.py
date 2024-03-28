Here is the Python equivalent of the provided Java code:

```python
def find_lucky_number(number):
    ans = -1
    value = 0
    mask = 2
    
    while value < number:
        s = bin(mask)[3:]
        zeros = s.count('0')

        if zeros != len(s) - zeros:
            mask += 1
            continue
        
        s = s.replace('0', '4').replace('1', '7')
        value = int(s)
        mask += 1

    return value


# Test input
number = 77777777

# Expected output: 4444477694
print(find_lucky_number(number))
```

This Python function, `find_lucky_number`, implements the logic provided in the Java code to find the lucky number based on the input condition. Note that the `substring(1)` call in Java corresponds to `[3:]` in Python because of the leading '0b' prefix that Python's `bin` function adds to represent a binary number. We need to skip the '0b1' characters, hence `[3:]` is used instead of `[2:]`.
