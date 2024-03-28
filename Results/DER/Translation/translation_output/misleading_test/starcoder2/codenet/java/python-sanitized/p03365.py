import math

def c(n, k):
    return math.factorial(n) // math.factorial(k) // math.factorial(n - k)

n = int(input())

md = [0] * n

rm = n - 2
lx = n - 2
while rm >= 0:
    md[lx + 1] = c(rm, lx)
    rm -= 2
    lx -= 1

res = 0
prev = 0
for m in range(1, n):
    cur = math.factorial(m) * math.factorial(n - m - 1) % 1000000007
    cur = cur * (md[m]) % 1000000007

    res += (cur - prev + 1000000007) * m % 1000000007
    prev = cur

print(res % 1000000007)