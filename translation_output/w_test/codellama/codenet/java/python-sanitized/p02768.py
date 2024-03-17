import math

def pow(a, b):
    s = 1
    a2 = a
    while b > 0:
        if b & 1:
            s = s * a2 % m
        a2 = a2 * a2 % m
        b >>= 1
    return int(s)

def reverse(a):
    return pow(a, m - 2)

def sub(n, a):
    if a > n // 2:
        a = n - a
    s1 = 1
    n2 = n - a
    for i in range(n, n2 - 1, -1):
        s1 = s1 * i % m
    s2 = 1
    for i in range(1, a + 1):
        s2 = s2 * i % m
    s3 = reverse(int(s2))
    return (s1 * s3) % m

def main(n, a, b):
    all = pow(2, n)
    answer = (all + 2 * m - sub(n, a) - sub(n, b) - 1) % m
    print(answer)

if __name__ == "__main__":
    n = int(input("Enter n: "))
    a = int(input("Enter a: "))
    b = int(input("Enter b: "))
    main(n, a, b)