Here's the equivalent Python code using the `input()` function for user input and the `fractions` module that provides the functionality to manage large integer calculations:

```python
from fractions import Fraction

def main():
    # input two large integers
    a = int(input())
    b = int(input())
    
    # divide a by b using the Fraction class for precise division
    result = Fraction(a, b)
    
    # print the simplified quotient
    print(result.numerator // result.denominator)

if __name__ == "__main__":
    main()
```

This Python code also ensures that the quotient is an integer by performing integer division (`//`) on the numerator of the simplified `Fraction`. If instead you want the output to match Java's `BigInteger` division precisely (which floors the result if it's negative), you'll need to handle it according to the signs of `a` and `b` or to use `a // b` directly if `Fraction` simplification is not necessary.
