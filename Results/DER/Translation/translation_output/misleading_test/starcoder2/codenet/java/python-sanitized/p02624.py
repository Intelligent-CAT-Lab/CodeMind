import math

def divisors(n):
    divs = []
    for i in range(1, int(math.sqrt(n)) + 1):
        if n % i == 0:
            if n / i == i:
                divs.append(i)
            else:
                divs.append(i)
                divs.append(n / i)
    return divs

n = int(input())
res = 0
for i in range(1, n + 1):
    res += i * len(divisors(i))
print(res)