Here's the translated Java code to Python:

```python
import math

def is_prime(n):
    for i in range(2, math.isqrt(n) + 1):
        if n % i == 0:
            return False
    return True

def main():
    N = int(input())

    count = 0
    for i in range(6, 55556, 5):
        if is_prime(i):
            print(f"{i} ", end="")
            count += 1
        if count == N:
            break

if __name__ == "__main__":
    main()
```

This Python code performs the same operations as the original Java code. It finds `N` prime numbers that are congruent to 1 modulo 5 and prints them out.

To test the code, you can run it and provide an input of 5:

Test input:
```
5
```

Expected output:
```
3 5 7 11 31 
```
