```python
import math

INF = float('inf')

mh = [0, 1, 0, -1]
mw = [1, 0, -1, 0]

def is_prime(n):
    for i in range(2, int(math.sqrt(n)) + 1):
        if n % i == 0:
            return False
    return True

def main():
    N = ni()
    count = 0
    for i in range(6, 55556, 5):
        if is_prime(i):
            print(i, end=" ")
            count += 1
        if count == N:
            break

def ni():
    return int(input())

if __name__ == "__main__":
    main()
```
