Below is the translated Python code for the given Java code snippet:

```python
def euler_totient(n):
    phi = list(range(n + 1))
    for i in range(2, n + 1):
        if phi[i] == i:
            for j in range(i, n + 1, i):
                phi[j] = phi[j] // i * (i - 1)
    return phi[n]

def euler_totient_long(n):
    i = n
    phi = n
    if i % 2 == 0:
        phi //= 2
        while i % 2 == 0:
            i //= 2
    if i % 3 == 0:
        phi = phi // 3 * 2
        while i % 3 == 0:
            i //= 3

    j = 1
    while True:
        tmp = j * 6 - 1
        if tmp * tmp > n:
            break
        if i % tmp == 0:
            phi = phi // tmp * (tmp - 1)
            while i % tmp == 0:
                i //= tmp

        tmp = j * 6 + 1
        if tmp * tmp > n:
            break
        if i % tmp == 0:
            phi = phi // tmp * (tmp - 1)
            while i % tmp == 0:
                i //= tmp

        j += 1

    if i != 1:
        phi = phi // i * (i - 1)

    return phi

# Sample Test Case
n = 6
print(euler_totient_long(n))
```

I've omitted the I/O handling and classes related to the output stream (`Printer`), error handling, and test cases (`Scanner` class and `INPUT` global variable) because Python's built-in input and print functions can be used directly without the need for such constructs.

The `solve()` function was not directly translated, since it's commonly used to run the main program in Java, whereas in Python, you typically run the main code directly or under an `if __name__ == '__main__':` block, which is unnecessary here for the given test case.

Please note, the original Java code calculates the Euler totient function in two different ways, using `Euler` class for integer inputs and a static method for long integers. The Python translation maintains the respective functionality for the two scenarios.
