Here is the Python equivalent of the Java code:

```python
def sum_digits(n):
    sum = 0
    while n != 0:
        sum += n % 10
        n //= 10
    return sum

n = int(input())
a = sum_digits(n)
if n % a == 0:
    print("Yes")
else:
    print("No")
```

In Python, we don't need to import any libraries like in Java. We can use the built-in `input()` function to get user input, and we don't need to declare the data type of variables like in Java. We also don't need to declare the size of an array or list in Python, so I removed the lines that were creating an array or list. The `//=` operator is used for integer division in Python, which is equivalent to `/=` in Java.
