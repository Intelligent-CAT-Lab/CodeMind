Here is the Python equivalent of the Java code:

```python
import sys

def is_prime(n):
    if n <= 1:
        return False
    for i in range(2, int(n**0.5) + 1):
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

This Python code does the same thing as the Java code. It reads an integer N from the user, then iterates over the numbers from 6 to 55555, checking if each number is prime. If it is, it prints the number and increments a counter. The loop stops when the counter reaches N.
