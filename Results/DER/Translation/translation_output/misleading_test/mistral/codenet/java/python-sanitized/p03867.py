import math

def pow(n, k):
    ans = 1
    while k != 0:
        if k % 2 == 1:
            ans = (ans * n) % 1000000007
        n = (n * n) % 1000000007
        k //= 2
    return ans

def divisors(n):
    divisors = []
    for i in range(1, int(math.sqrt(n))+1):
        if n % i == 0:
            divisors.append(i)
            if i != n//i:
                divisors.append(n//i)
    divisors.sort()
    return divisors

N, K = map(int, input().split())
divisors = divisors(N)
num = [pow(K, (divisor+1)//2) for divisor in divisors]
for i in range(len(divisors)):
    for j in range(i, len(divisors)):
        if divisors[i] % divisors[j] == 0:
            num[i] -= num[j]
    num[i] %= 1000000007
ans = 0
for divisor in divisors:
    ans += num[i]*divisor//2
    ans %= 1000000007
print(ans)