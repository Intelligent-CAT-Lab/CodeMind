import math

def lcm(A, B):
    return (A*B) // math.gcd(A, B)

A, B = map(int, input().split())
print(lcm(A, B))