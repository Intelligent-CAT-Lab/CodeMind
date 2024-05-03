Here is the Python equivalent of the Java code:

```python
def prime(x):
    for i in range(2, x):
        if x % i == 0:
            return False
    return True

x = int(input())

while not prime(x):
    x += 1

print(x)
```

This Python code does the same thing as the Java code. It defines a function `prime` that checks if a number is prime. Then it reads an integer from the user, and keeps incrementing it until it finds a prime number, which it then prints.
