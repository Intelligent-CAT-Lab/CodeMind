import sys

def is_prime(n):
    if n <= 1:
        return False
    for i in range(2, int(n**0.5) + 1):
        if n % i == 0:
            return False
    return True

def gcd(a, b):
    while b != 0:
        a, b = b, a % b
    return a

n = int(input())
if n == 2:
    print("4 7")
    print("23 10")
    sys.exit()

snt = [0] * (n * 2)
cn = 0
x = 2
while cn < n * 2:
    if is_prime(x):
        snt[cn] = x
        cn += 1
    x += 1

a = [[0] * n for _ in range(n)]
for i in range(n):
    for j in range(i % 2, n, 2):
        a[i][j] = snt[(i + j) // 2] * snt[(j - i + n - 1) // 2 + n]

dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]
for i in range(n):
    for j in range(i + 1, n, 2):
        gcd = 0
        tich = 1
        for k in range(4):
            if i + dx[k] < 0 or i + dx[k] >= n:
                continue
            if j + dy[k] < 0 or j + dy[k] >= n:
                continue
            if gcd == 0:
                gcd = a[i + dx[k]][j + dy[k]]
                tich = gcd
            else:
                gcd = gcd(tich, a[i + dx[k]][j + dy[k]])
                tich = tich // gcd * a[i + dx[k]][j + dy[k]]
        a[i][j] = tich + 1

for i in range(n):
    for j in range(n):
        print(a[i][j], end=" ")
    print()

def is_snt(n):
    if n <= 1:
        return False
    for i in range(2, int(n**0.5) + 1):
        if n % i == 0:
            return False
    return True

def gcd(a, b):
    while b != 0:
        a, b = b, a % b
    return a