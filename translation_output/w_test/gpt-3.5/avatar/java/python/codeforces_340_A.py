```python
import sys
from math import gcd

def main():
    x, y, a, b = map(int, sys.stdin.readline().strip().split())
    
    c = 0
    lcm = x * y // gcd(x, y)

    i = a
    while i <= b:
        if i % lcm == 0:
            break
        i += 1

    j = b
    while j >= a:
        if j % lcm == 0:
            break
        j -= 1

    if j % lcm == 0 and i % lcm == 0:
        c = (j - i) // lcm + 1

    print(c)

if __name__ == "__main__":
    main()
```
