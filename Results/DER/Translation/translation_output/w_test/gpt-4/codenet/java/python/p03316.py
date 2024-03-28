Here is the equivalent Python code:

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

When you run the Python code, it will expect an input just like the Java code. You can input `12` and you should get `Yes` as the expected output.
