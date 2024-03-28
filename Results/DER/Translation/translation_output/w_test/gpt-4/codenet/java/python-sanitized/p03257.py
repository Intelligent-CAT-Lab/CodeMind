def is_prime(x):
    for i in range(2, int(x**0.5) + 1):
        if x % i == 0:
            return False
    return True

def gcd(a, b):
    return a if b == 0 else gcd(b, a % b)

n = int(input())

if n == 2:
    print("4 7")
    print("23 10")
else:
    primes = []
    x = 2
    while len(primes) < n * 2:
        if is_prime(x):
            primes.append(x)
        x += 1

    a = [[0]*n for _ in range(n)]
    for i in range(n):
        for j in range(i % 2, n, 2):
            a1 = (i + j) // 2
            a2 = (j - i + n - 1) // 2 + n
            a[i][j] = primes[a1] * primes[a2]

    dx = [-1, 0, 1, 0]
    dy = [0, 1, 0, -1]
    for i in range(n):
        for j in range((i + 1) % 2, n, 2):
            current_gcd = 0
            product = 1
            for k in range(4):
                ni = i + dx[k]
                nj = j + dy[k]
                if ni < 0 or ni >= n or nj < 0 or nj >= n:
                    continue
                if current_gcd == 0:
                    current_gcd = a[ni][nj]
                    product = current_gcd
                else:
                    current_gcd = gcd(product, a[ni][nj])
                    product = product // current_gcd * a[ni][nj]
            a[i][j] = product + 1

    for row in a:
        print(' '.join(map(str, row)))