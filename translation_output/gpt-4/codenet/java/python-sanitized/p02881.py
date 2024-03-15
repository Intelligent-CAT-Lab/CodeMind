import math
import sys

def solver(n):
    sqrt = int(math.sqrt(n))
    x = y = 0
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

def gcd(a, b):
    while b:
        a, b = b, a % b
    return a

class Pair:
    def __init__(self, x, s):
        self.x = x
        self.s = s

    def __lt__(self, other):
        return self.x < other.x

# Assuming that n is read from input as the first and only line
if __name__ == "__main__":
    n = int(input().strip())
    result = solver(n)
    print(result)