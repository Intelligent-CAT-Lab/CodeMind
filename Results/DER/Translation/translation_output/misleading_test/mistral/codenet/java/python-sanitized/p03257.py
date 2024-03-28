import math

def isSNT(x):
    for i in range(2, int(math.sqrt(x))+1):
        if x % i == 0:
            return False
    return True

def gcd(a, b):
    return a if b == 0 else gcd(b, a % b)

n = int(input())

snt = []
x = 2
while len(snt) < n*2:
    if isSNT(x):
        snt.append(x)
    x += 1

a = [[0 for j in range(n)] for i in range(n)]
for i in range(n):
    for j in range(i%2, n, 2):
        a[i][j] = snt[(i+j)//2] * snt[(j-i+n-1)//2 + n]

dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]
for i in range(n):
    for j in range(i%2+1, n, 2):
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
        a[i][j] = tich+1

for i in range(n):
    for j in range(n):
        print(a[i][j], end=" ")
    print()