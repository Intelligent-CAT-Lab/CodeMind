Here is the Java code translated into Python:

```python
def gcd(x, y):
    while y != 0:
        x, y = y, x % y
    return x

def least_common_multiple(a, b):
    return (a * b) // gcd(a, b)

# Main code execution
if __name__ == "__main__":
    A, B, C, D = map(int, input().split())
    n = B - A + 1
    
    if C == D:
        a = A // C
        b = B // C
        x = b - a
        if A % C == 0:
            x += 1
        answer = n - x
        print(answer)
    else:
        a = A // C
        b = B // C
        p = b - a
        if A % C == 0:
            p += 1

        a = A // D
        b = B // D
        q = b - a
        if A % D == 0:
            q += 1

        e = least_common_multiple(C, D)
        a = A // e
        b = B // e
        r = b - a
        if A % e == 0:
            r += 1

        answer = n - (p + q - r)
        print(answer)
```

To test the code with the input `4 9 2 3` and get the expected output `73`, you would run it and provide the input like this:

```
4 9 2 3
```

Copy and paste the Python code into a Python interpreter or a .py file and provide the input to verify that it calculates the correct answer.
