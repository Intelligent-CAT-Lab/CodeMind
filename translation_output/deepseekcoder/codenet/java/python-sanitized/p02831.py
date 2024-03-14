import sys

def gcd(A, B):
    gcd = 0
    for i in range(1, max(A, B)):
        if A % i == 0 and B % i == 0:
            gcd = i
    return gcd

def lcm(A, B):
    return A * B // gcd(A, B)

A = int(sys.stdin.readline().strip())
B = int(sys.stdin.readline().strip())

print(lcm(A, B))