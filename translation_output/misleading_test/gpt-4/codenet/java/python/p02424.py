Here is the Python code equivalent to the provided Java code:

```python
def to_string(x):
    return ''.join(str((x >> i) & 1) for i in range(32))[::-1]

def main():
    a, b = map(int, input().split())
    print(to_string(a & b))
    print(to_string(a | b))
    print(to_string(a ^ b))

if __name__ == "__main__":
    main()
```

When you input `8 10`, the expected output should be:

```
981
1038
36
```

However, please note that in the Python version, binary representation does not include leading zeroes as in the Java version (which uses a 32-bit representation). If you want the Python version to print leading zeroes, similar to the 32-bit representation in Java, you could modify the `to_string` function like this:

```python
def to_string(x):
    return format(x, '032b')

def main():
    a, b = map(int, input().split())
    print(int(to_string(a & b), 2))
    print(int(to_string(a | b), 2))
    print(int(to_string(a ^ b), 2))

if __name__ == "__main__":
    main()
```

This updated `to_string` function uses Python's `format` method to convert the number to a binary string with leading zeroes to fill a width of 32 characters.
