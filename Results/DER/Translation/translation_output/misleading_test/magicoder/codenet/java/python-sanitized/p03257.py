import math

def is_prime(n):
    if n <= 1:
        return False
    if n == 2:
        return True
    if n % 2 == 0:
        return False
    sqrt_n = int(math.sqrt(n)) + 1
    for i in range(3, sqrt_n, 2):
        if n % i == 0:
            return False
    return True

def gcd(a, b):
    if b == 0:
        return a
    else:
        return gcd(b, a % b)

def main():
    n = int(input())
    if n == 2:
        print("4 7")
        print("23 10")
        return

    snt = []
    cn = 0
    x = 2
    while cn < n * 2:
        if is_prime(x):
            snt.append(x)
            cn += 1
        x += 1

    a = [[0] * n for _ in range(n)]
    for i in range(n):
        for j in range(i % 2, n, 2):
            a1 = (i + j) // 2
            a2 = (j - i + n - 1) // 2 + n
            a[i][j] = snt[a1] * snt[a2]

    dx = [-1, 0, 1, 0]
    dy = [0, 1, 0, -1]
    for i in range(n):
        for j in range((i + 1) % 2, n, 2):
            gcd_val = 0
            tich = 1
            for k in range(4):
                if i + dx[k] < 0 or i + dx[k] >= n:
                    continue
                if j + dy[k] < 0 or j + dy[k] >= n:
                    continue
                if gcd_val == 0:
                    gcd_val = a[i + dx[k]][j + dy[k]]
                    tich = gcd_val
                else:
                    gcd_val = gcd(tich, a[i + dx[k]][j + dy[k]])
                    tich = tich // gcd_val * a[i + dx[k]][j + dy[k]]
            a[i][j] = tich + 1

    for i in range(n):
        for j in range(n):
            print(a[i][j], end=' ')
        print()

if __name__ == "__main__":
    main()