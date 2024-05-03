Here is the Python equivalent of the Java code:

```python
a = int(input())
b = int(input())
c = int(input())

for i in range(5000):
    if a * i % b == c:
        print("YES")
        break
else:
    print("NO")
```

In Python, we use the `input()` function to get user input, and `int()` to convert the input to an integer. The `range()` function is used to generate a sequence of numbers from 0 to 4999. The `for` loop iterates over this sequence, and the `if` statement checks if the product of `a` and `i` is divisible by `b` with a remainder of `c`. If this condition is met, the program prints "YES" and breaks out of the loop. If the loop completes without finding a match, the program prints "NO".
