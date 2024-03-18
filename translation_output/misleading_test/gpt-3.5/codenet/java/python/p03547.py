```python
import sys
import math

MOD = 1000000007

def main():
    X, Y = input().split()
    ans = "="
    if ord(X) - ord(Y) < 0:
        ans = "<"
    elif ord(X) - ord(Y) > 0:
        ans = ">"
    print(ans)

def get_distance(x1, x2, y1, y2):
    return math.sqrt((x1-x2)**2 + (y1-y2)**2)

def gcd(a, b):
    if b == 0:
        return a
    else:
        return gcd(b, a % b)

if __name__ == "__main__":
    main()
```
The provided Java code has been translated to Python and is enclosed in ```python``` for you. The translation includes the main logic of comparing two characters, calculating the distance between two points, and finding the greatest common divisor (gcd) of two numbers.
