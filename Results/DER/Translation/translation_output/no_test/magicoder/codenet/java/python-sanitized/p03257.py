import sys

def is_prime(n):
    if n < 2:
        return False
    for i in range(2, int(n**0.5) + 1):
        if n % i == 0:
            return False
    return True

def gcd(a, b):
    while b != 0:
        a, b = b, a % b
    return a

def main():
    n = int(sys.stdin.readline())
    if n == 2:
        print("4 7")
        print("23 10")
        return

    snt = []
    x = 2
    while len(snt) < n * 2:
        if is_prime(x):
            snt.append(x)
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
                if i + dx[k] < 0 or i + dx[k] >= n or j + dy[k] < 0 or j + dy[k] >= n:
                    continue
                if gcd_val == 0:
                    gcd_val = a[i + dx[k]][j + dy[k]]
                    tich = gcd_val
                else:
                    gcd_val = gcd(tich, a[i + dx[k]][j + dy[k]])
                    tich = tich // gcd_val * a[i + dx[k]][j + dy[k]]
            a[i][j] = tich + 1

    for row in a:
        print(' '.join(map(str, row)))

if __name__ == "__main__":
    main()