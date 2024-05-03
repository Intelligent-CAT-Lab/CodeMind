Here is the Python equivalent of the Java code:

```python
import sys
import math

def is_prime(n):
    for i in range(2, int(math.sqrt(n)) + 1):
        if n % i == 0:
            return False
    return True

def main():
    N = int(input())
    
    count = 0
    for i in range(6, 55555, 5):
        if is_prime(i):
            print(i, end=" ")
            count += 1
        if count == N:
            break

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code: it prints out the first N prime numbers greater than or equal to 6. The `is_prime` function checks if a number is prime by trying to divide it by all numbers up to its square root. If any of them divide evenly, the function returns `False`, indicating that the number is not prime. If none of them divide evenly, the function returns `True`, indicating that the number is prime. The `main` function reads an integer from the user, calls `is_prime` to check if it's prime, and prints it out if it is. It repeats this process until it has printed out N prime numbers.
