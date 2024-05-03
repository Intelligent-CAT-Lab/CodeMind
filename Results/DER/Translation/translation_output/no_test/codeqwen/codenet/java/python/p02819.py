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

This Python code does the same thing as the Java code: it takes an integer input from the user, checks if it's a prime number, and if not, increments it until it is. It then prints the final prime number.
