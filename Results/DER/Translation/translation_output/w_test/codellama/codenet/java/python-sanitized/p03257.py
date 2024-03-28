import sys

def is_snt(x):
    for i in range(2, int(x**0.5) + 1):
        if x % i == 0:
            return False
    return True

def gcd(a, b):
    if b == 0:
        return a
    else:
        return gcd(b, a % b)

def main():
    n = int(input())
    snt = [i for i in range(2, n*2) if is_snt(i)]

    a = [[0 for _ in range(n)] for _ in range(n)]
    for i in range(n):
        for j in range(i % 2, n, 2):
            a1 = (i + j) // 2
            a2 = (j - i + n - 1) // 2 + n
            a[i][j] = snt[a1] * snt[a2]

    dx = [-1, 0, 1, 0]
    dy = [0, 1, 0, -1]
    for i in range(n):
        for j in range((i + 1) % 2, n, 2):
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

if __name__ == "__main__":
    main()