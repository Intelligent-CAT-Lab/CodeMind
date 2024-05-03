Here is the Python equivalent of the Java code:

```python
import math

def pow(base, n):
    retVal = 1
    while n > 0:
        if (n & 1) == 1:
            retVal *= base
        n >>= 1
        base *= base
    return retVal

def solve(x):
    pow_map = {0: 0, 1: 1}
    base = 2
    while True:
        pow_val = pow(base, 5)
        pow_map[pow_val] = base
        if pow_val - pow_map[pow_val - 1] > x:
            break
        base += 1
    
    for key in pow_map:
        diff = abs(x - key)
        if diff in pow_map:
            print(pow_map[key], end='')
            if key - x < 0:
                print(' -', pow_map[diff], end='')
            else:
                print(' ', pow_map[diff], end='')
            print()
            return

def main():
    x = int(input())
    solve(x)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It calculates the powers of 2 to the power of 5 and stores them in a dictionary. Then it checks if the difference between the input number and the calculated power is in the dictionary. If it is, it prints the base number and the difference number. If not, it continues until it finds a match.
