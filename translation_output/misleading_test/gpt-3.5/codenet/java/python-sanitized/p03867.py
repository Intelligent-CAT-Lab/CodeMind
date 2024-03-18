MOD = 1000000007

# calculate n^k
def pow_func(n, k):
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
    div_list = []
    for i in range(1, int(n**0.5) + 1):
        if n % i == 0:
            div_list.append(i)
            if i != n // i:
                div_list.append(n // i)
    div_list.sort()
    return div_list

def main():
    N, K = map(int, input().split())
    divisor = divisors(N)
    num = [0] * len(divisor)
    tmp_sum = 0
    for i in range(len(divisor)):
        num[i] = pow_func(K, (divisor[i] + 1) // 2)
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
        num[i] %= MOD
        d = divisor[i]
        if d % 2 == 0:
            ans += num[i] * d // 2
        else:
            ans += num[i] * d
        ans %= MOD
    
    print(ans)

if __name__ == "__main__":
    main()