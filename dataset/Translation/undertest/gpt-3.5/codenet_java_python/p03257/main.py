def is_prime(x):
    if x < 2:
        return False
    for i in range(2, int(x**0.5) + 1):
        if x % i == 0:
            return False
    return True

n = int(input())
if n == 2:
    print("4 7")
    print("23 10")
    exit()

snt = []
x = 2
while len(snt) < n * 2:
    if is_prime(x):
        snt.append(x)
    x += 1

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
        gcd_val = 0
        product = 1
        for k in range(4):
            ni, nj = i + dx[k], j + dy[k]
            if ni < 0 or ni >= n or nj < 0 or nj >= n:
                continue
            if gcd_val == 0:
                gcd_val = a[ni][nj]
                product = gcd_val
            else:
                gcd_val = gcd(gcd_val, a[ni][nj])
                product = product // gcd_val * a[ni][nj]
        a[i][j] = product + 1

for row in a:
    print(" ".join(map(str, row)))

def gcd(a, b):
    return a if b == 0 else gcd(b, a % b)