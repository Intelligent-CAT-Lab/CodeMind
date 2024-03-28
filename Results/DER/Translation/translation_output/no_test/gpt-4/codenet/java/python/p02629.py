Here is the equivalent Python code for the Java code you provided:

```python
N = int(input())

out = []
while True:
    N -= 1  # Decrement N by 1
    x = N // 26
    y = N % 26
    out.append(chr(ord('a') + y))  # Append the character equivalent to the list
    if x == 0:
        break
    N = x

out_str = ''.join(reversed(out))  # Reverse the list and join to form a string
print(out_str)
```

This Python code takes an integer as input, performs calculations, and generates a string in a similar way as the Java code. One significant difference is that Python doesn't need to predefine an array size; we can dynamically append characters to a list and then join it together in reverse to form the final output string.
