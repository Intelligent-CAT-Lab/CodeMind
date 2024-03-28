import math
import sys

def gcd(a, b):
    if b == 0:
        return a
    else:
        return gcd(b, a % b)

def solver(n):
    sqrt = int(math.sqrt(n))
    x = 0
    y = 0
    for i in range(sqrt, 0, -1):
        if n % i == 0:
            x = i
            y = n // i
            break
    
    if x != 0 and y != 0:
        ans = (x - 1) + (y - 1)
    else:
        ans = n - 1
    
    return ans

if __name__ == '__main__':
    n = int(input())
    result = solver(n)
    print(result)

# Test case
# Input: 10
# Expected output: 40