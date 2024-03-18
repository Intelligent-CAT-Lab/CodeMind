Here's the equivalent Python code based on the Java code provided:

```python
def is_prime(n):
    for i in range(2, n):
        if n % i == 0:
            return False
    return True


def main():
    x = int(input())
    
    while not is_prime(x):
        x += 1
    print(x)


if __name__ == "__main__":
    main()
```

To test this with the input `20`, you would run the `main()` function and enter `20` when prompted. The expected output would be `29`, as it is the next prime number after `20`.
