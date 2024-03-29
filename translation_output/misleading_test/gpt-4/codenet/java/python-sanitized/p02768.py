def pow(a, b, m):
    s = 1
    a2 = a
    while b > 0:
        if b & 1:
            s = s * a2 % m
        a2 = a2 * a2 % m
        b >>= 1
    return s

def reverse(a, m):
    return pow(a, m - 2, m)

def sub(n, a, m):
    if a > n // 2:
        a = n - a
    s1 = 1
    n2 = n - a
    for i in range(n, n2, -1):
        s1 = s1 * i % m
    s2 = 1
    for i in range(1, a + 1):
        s2 = s2 * i % m
    s3 = reverse(s2, m)
    return s1 * s3 % m

def main():
    m = 1000000007
    n, a, b = map(int, input().split())

    all_ = pow(2, n, m)

    answer = (all_ + 2 * m - sub(n, a, m) - sub(n, b, m) - 1) % m
    print(answer)

if __name__ == "__main__":
    main()