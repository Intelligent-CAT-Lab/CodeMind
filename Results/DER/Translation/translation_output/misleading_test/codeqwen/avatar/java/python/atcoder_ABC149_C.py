Here is the Python equivalent of the Java code:

```python
def find_next_prime(n):
    while True:
        n += 1
        if all(n % i != 0 for i in range(2, int(n**0.5) + 1)):
            return n

print(find_next_prime(9552))
```

This Python function works by incrementing the input number until it finds a number that is only divisible by 1 and itself, which is the definition of a prime number. The function then returns this prime number. The `all` function in Python is a built-in function that returns `True` if all elements in an iterable are true. In this case, it checks if `n` is only divisible by 1 and itself by checking if `n % i` is not equal to 0 for all `i` from 2 to the square root of `n`.
