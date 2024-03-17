import math
n, m = map(int, input().split())
for i in range(int(m - (n % m))):
    print(int(n / m), end=" ")
for i in range(int(m - (n % m)), int(m)):
    print(math.ceil(n / m), end=" ")