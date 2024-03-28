def gcd(n, m):
    if m > n:
        return gcd(m, n)
    if m == 0:
        return n
    return gcd(m, n % m)

def lcm(m, n):
    return (m // gcd(m, n)) * n

def main():
    a = list(map(int, input().split()))
    a.sort()
    print(abs(a[0] + a[3] - a[1] - a[2]))

if __name__ == '__main__':
    main()