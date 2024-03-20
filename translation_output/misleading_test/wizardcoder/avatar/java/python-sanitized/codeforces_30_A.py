import math

def is_power(x, n):
    if x == 0:
        return False
    elif x == 1:
        return True
    elif n == 1:
        return True
    elif n % 2 == 0:
        return is_power(x*x, n//2)
    else:
        return is_power(x*x, n//2) or x == n

def find_power(A, B, N):
    for x in range(-1000, 1001):
        if is_power(x, N) and x*A == B:
            return x
    return "No solution"

A = int(input())
B = int(input())
N = int(input())

print(find_power(A, B, N))