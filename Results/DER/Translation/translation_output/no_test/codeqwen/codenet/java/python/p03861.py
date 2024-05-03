Here is the Python equivalent of the Java code:

```python
a = int(input())
b = int(input())
x = int(input())
count = 0
count = b // x - a // x
if a % x == 0:
    count += 1
print(count)
```

This Python code does the same thing as the Java code. It reads three integers from the user, calculates the number of times the third integer (x) fits into the range from the first integer (a) to the second integer (b), and then prints the result.
