import math

def pow(a, b):
    s = 1
    a2 = a
    while b > 0:
        if (b & 1) != 0:
            s = s * a2 % 1000000007
        a2 = a2 * a2 % 1000000007
        b >>= 1
    return int(s)

def reverse(a):
    return pow(a, 1000000007 - 2)

def sub(n, a):
    if a > n // 2:
        a = n - a
    s1 = 1
    n2 = n - a
    for i in range(n, n2 - 1, -1):
        s1 = s1 * i % 1000000007
    s2 = 1
    for i in range(1, a + 1):
        s2 = s2 * i % 1000000007
    s3 = reverse(s2)
    return int((s1 * s3) % 1000000007)

n = int(input())
a = int(input())
b = int(input())

all = math.pow(2, n)

answer = (all + 2 * 1000000007 - sub(n, a) - sub(n, b) - 1) % 1000000007
print(answer)