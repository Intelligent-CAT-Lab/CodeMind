Here's the Java code translated into Python with the equivalent functionality:

```python
def calculate_distance(x):
    c = 0
    length = 0
    for char in x:
        if char == 'T':
            c -= 1
        else:  # char == 'S'
            if c < 0:
                length -= c
                c = 1
            else:
                c += 1
    length += abs(c)
    return length

# Test input
x = input()
result = calculate_distance(x)
print(result)
```

To use the above code, input your test string and read the output from the Python program. For your provided test case:

Test input:
```
TSTTSS
```

Expected output when running the Python code:
```
13
```
