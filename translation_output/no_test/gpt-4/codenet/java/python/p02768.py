Here is the translated Python code:

```python
class p02768:
    m = 1000000007

    @staticmethod
    def pow(a, b):
        s = 1
        a2 = a
        while b > 0:
            if b & 1:
                s = s * a2 % p02768.m
            a2 = a2 * a2 % p02768.m
            b >>= 1
        return s
    
    @staticmethod
    def reverse(a):
        return p02768.pow(a, p02768.m - 2)

    @staticmethod
    def sub(n, a):
        if a > n // 2:
            a = n - a
        s1 = 1
        n2 = n - a
        for i in range(n, n2, -1):
            s1 = s1 * i % p02768.m
        s2 = 1
        for i in range(1, a + 1):
            s2 = s2 * i % p02768.m
        s3 = p02768.reverse(s2)
        return s1 * s3 % p02768.m

# Main method equivalent
if __name__ == "__main__":
    n = int(input())
    a = int(input())
    b = int(input())

    all = p02768.pow(2, n)

    answer = (all + 2 * p02768.m - p02768.sub(n, a) - p02768.sub(n, b) - 1) % p02768.m
    print(answer)
```

This Python code maintains the logic of the Java program. However, there are some differences in Python that should be noted:

- Static methods in Python can be defined with the `@staticmethod` decorator.
- The `pow` function in Python uses `%` for the modulus, the same as in Java.
- The main method equivalent is provided by using the `if __name__ == "__main__":` idiom to check if the script is being run as the main program.
- In Python, the division operator `/` performs floating-point division, while `//` performs integer division. This is why `n // 2` is used for integer division instead of `n / 2`.
- The `Scanner` class from Java is not present in Python. Input is read using `input()` and converted to an integer with `int()`.
