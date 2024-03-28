import math

def get_lcm(a, b):
    gcd = 0
    for i in range(1, max(a, b)):
        if a % i == 0 and b % i == 0:
            gcd = i
    return a * b // gcd

a, b = map(int, input().split())
print(get_lcm(a, b))