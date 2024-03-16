import math
from functools import reduce
from itertools import permutations

def solve(a, b):
    print(max(1, (b + a - 1) // a))

def gcd(a, b):
    while b:
        a, b = b, a % b
    return a

def lcm(a, b):
    return a // gcd(a, b) * b

def factorial(i):
    if i == 1:
        return 1
    else:
        return i * factorial(i - 1)

def manhat(x1, y1, x2, y2):
    return abs(x1 - x2) + abs(y1 - y2)

def euclid(x1, y1, x2, y2):
    return math.sqrt((x2 - x1) ** 2 + (y2 - y1) ** 2)

def is_prime(n):
    if n == 2:
        return True
    if n < 2 or n % 2 == 0:
        return False
    for i in range(3, int(math.sqrt(n)) + 1, 2):
        if n % i == 0:
            return False
    return True

if __name__ == "__main__":
    a, b = map(int, input().split())
    solve(a, b)