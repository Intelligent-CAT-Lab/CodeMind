```python
MOD = 1000000007

def pow(n, k):
    ans = 1
    tmp = n
    while True:
        if k == 0:
            return ans
        if k % 2 == 1:
            ans = (ans * tmp) % MOD
        tmp = (tmp * tmp) % MOD
        k //= 2

def divisors(n):
    lst = []
    for i in range(1, int(n**0.5) + 1):
        if n % i == 0:
            lst.append(i)
            if i != n // i:
                lst.append(n // i)
    lst.sort()
    return lst

def main():
    N, K = map(int, input().split())
    divisor = divisors(N)
    num = [0] * len(divisor)
    tmp_sum = 0
    for i in range(len(divisor)):
        num[i] = pow(K, (divisor[i] + 1) // 2)
        for j in range(i):
            if divisor[i] % divisor[j] == 0:
                num[i] -= num[j]
        while num[i] < 0:
            num[i] += MOD
        tmp_sum += num[i]
        tmp_sum %= MOD

    ans = 0
    for i in range(len(divisor)):
        if num[i] < 0:
            num[i] += MOD
        num[i] = num[i] % MOD
        d = divisor[i]
        if d % 2 == 0:
            ans += num[i] * (d // 2)
        else:
            ans += num[i] * d
        ans %= MOD

    print(ans)

if __name__ == '__main__':
    main()
```

