Below is the translated Java code into Python using similar logic.

```python
from decimal import Decimal

A = Decimal(input().strip())
B = Decimal(input().strip())
print(A * B)
```

Note that while Java has a specific `BigInteger` class for handling arbitrarily large integers, Python's built-in `int` type can handle arbitrarily large integers by default. However, if you want to work with very large numbers with decimal values, like in the Java example, you should use the `Decimal` class from the `decimal` module, which is what I did above.

If you are only working with integers and not with decimal values, you can simplify this further by using the `int` type directly:

```python
A = int(input().strip())
B = int(input().strip())
print(A * B)
```
