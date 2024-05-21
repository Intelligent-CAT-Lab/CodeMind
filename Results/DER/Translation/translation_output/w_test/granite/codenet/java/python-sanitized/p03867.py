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
    divisors = []
    for i in range(1, int(n**0.5) + 1):
        if n % i == 0:
            divisors.append(i)
            if i!= n // i:
                divisors.append(n // i)
    divisors.sort()
    return divisors

def main():
    N, K = map(int, input().split())
    divisors_list = divisors(N)
    num = [pow(K, (d + 1) // 2) for d in divisors_list]
    for i in range(len(num)):
        for j in range(i):
            if divisors_list[i] % divisors_list[j] == 0:
                num[i] -= num[j]
                num[i] %= MOD
    ans = 0
    for i in range(len(num)):
        if divisors_list[i] % 2 == 0:
            ans += num[i] * divisors_list[i] // 2
        else:
            ans += num[i] * divisors_list[i]
        ans %= MOD
    print(ans)

if __name__ == "__main__":
    main()