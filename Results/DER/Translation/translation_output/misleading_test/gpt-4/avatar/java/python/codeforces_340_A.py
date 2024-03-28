Here is the Python translation for the given Java code:

```python
from math import gcd

def main():
    z = input().split()
    x = int(z[0])
    y = int(z[1])
    a = int(z[2])
    b = int(z[3])

    c = 0
    lcm = x * y // gcd(x, y)

    i = a + (lcm - a % lcm) % lcm
    j = b - (b % lcm)
    
    if j >= i:
        c = (j - i) // lcm + 1

    print(c)

if __name__ == "__main__":
    main()
```

Now you can test the provided test case with this Python code:

Test input:
`1 1 1 1000000000`

Expected output:
`1000000044`
