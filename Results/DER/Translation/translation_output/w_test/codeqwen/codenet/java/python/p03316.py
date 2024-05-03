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

This Python code does the same thing as the Java code. It reads an integer from the user, calculates the sum of its digits, and then checks if the original number is divisible by the sum of its digits. If it is, it prints "Yes", otherwise it prints "No".
