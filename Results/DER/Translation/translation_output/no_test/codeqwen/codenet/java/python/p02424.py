Here is the Python equivalent of the Java code:

```python
def to_string(x):
    return bin(x)[2:].zfill(32)

a = int(input())
b = int(input())

print(to_string(a & b))
print(to_string(a | b))
print(to_string(a ^ b))
```

In this Python code, we use the built-in `bin()` function to convert the numbers to binary strings, and then remove the '0b' prefix by slicing the string from the 2nd character onwards. The `zfill(32)` function is used to pad the binary string with leading zeros to ensure it is 32 characters long.
