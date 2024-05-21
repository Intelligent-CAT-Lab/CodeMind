import math

def q(a, b):
    if b > 0:
        return math.floor(a / b)
    else:
        return math.ceil(a / b)

def r(a, b):
    return a - q(a, b) * b

def floor(a, b):
    if b < 0:
        a *= -1
        b *= -1
    if a > 0:
        return a // b
    else:
        return (a - b + 1) // b

def ceil(a, b):
    if b < 0:
        a *= -1
        b *= -1
    if a > 0:
        return (a + b - 1) // b
    else:
        return a // b

def max(a):
    return max(a)

def min(a):
    return min(a)

def max(a):
    return max(a)

def min(a):
    return min(a)

N = int(input())
ans = ""
while N!= 0:
    q_val = q(N, -2)
    r_val = r(N, -2)
    ans = str(r_val) + ans
    N = q_val
print(ans)