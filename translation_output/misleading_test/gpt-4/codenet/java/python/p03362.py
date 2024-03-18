Below is the Python equivalent of the Java code you've provided.

```python
import math

def is_prime(n):
    for i in range(2, int(math.sqrt(n)) + 1):
        if n % i == 0:
            return False
    return True

def main():
    N = int(input())
    
    count = 0
    for i in range(6, 55556, 5):
        if is_prime(i):
            print(i, end=" ")
            count += 1
        if count == N:
            break

if __name__ == '__main__':
    main()
```

When the given test input `5` is provided, the code will output 5 prime numbers (each congruent to 1 modulo 5) as per the original Java code logic:
```
11 31 41 61 71
``` 

Note that the output will differ from the one you initially listed ("-81 55 101 -20 84") which is neither the result of the Java code nor a valid result for prime numbers congruent to 1 modulo 5.
