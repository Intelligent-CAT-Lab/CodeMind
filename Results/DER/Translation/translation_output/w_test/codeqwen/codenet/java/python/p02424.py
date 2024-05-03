Here is the Python equivalent of the Java code:

```python
def to_string(x):
    return ''.join(str(x % 2) for _ in range(32))[::-1]

a, b = map(int, input().split())
print(to_string(a & b))
print(to_string(a | b))
print(to_string(a ^ b))
```

This Python code does the same thing as the Java code. It reads two integers from the user, converts them to binary strings of 32 bits each, performs the bitwise AND, OR, and XOR operations, and then prints the results. The `to_string` function converts a long integer to a binary string of 32 bits. The `map` function is used to convert the user input to integers. The `input` function is used to read the user input. The `split` function is used to split the user input into two integers. The `join` function is used to concatenate the binary strings. The `[::-1]` slice is used to reverse the binary string.
