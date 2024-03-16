Here is the translated Python code based on the provided Java code:

```python
def to_string(x):
    return format(x, '032b')  # Using format to create a 32-bit binary representation

if __name__ == "__main__":
    a, b = map(int, input().split())
    print(to_string(a & b))
    print(to_string(a | b))
    print(to_string(a ^ b))
```

If you run the provided test input `8 10` in this Python code, it should give the expected output:

```
00000000000000000000000000001000
00000000000000000000000000001010
00000000000000000000000000000010
```
