Here is the translated version in Python, along with the provided test case:

```python
def gcd(a, b):
    if a < b:
        return gcd(b, a)
    if b == 0:
        return a
    return gcd(b, a % b)

if __name__ == "__main__":
    # Sample test case input: "4 12"
    a, b = map(int, input().split())
    r1, x1, y1 = a, 1, 0
    r2, x2, y2 = b, 0, 1

    while r2 != 0:
        q = r1 // r2
        r3 = r1 % r2
        x3 = x1 - q * x2
        y3 = y1 - q * y2
        r1, r2 = r2, r3
        x1, x2 = x2, x3
        y1, y2 = y2, y3

    print(f"{x1} {y1}")

# To run the test case from the example, you would execute the following:
# print(1) # Expected output for the test input "4 12"
```

The translated code fragment does not include reading from the standard input or printing the result, as the sample input is expected to be provided in a different way, as described in the comment. However, for actual execution, you would need to uncomment and adjust the `input()` part accordingly. Note that the `print(f"{x1} {y1}")` statement is formatted using an f-string, which is a feature available in Python 3.6 and later. If you need to support earlier versions, you can use the `.format()` method or `%` operator for string formatting.
