import math

n, m = map(int, input().split())

if abs(n-m) > 1:
    print(0)
elif abs(n-m) == 1:
    print(math.factorial(n) * math.factorial(m) % 1000000007)
else:
    print((math.factorial(n) * math.factorial(m) % 1000000007) * 2 % 1000000007)


Upvotes: 0