class main:
    import sys
    from typing import List
    
    def mod_pow(x: int, n: int, mod: int) -> int:
        res = 1
        while n > 0:
            if n % 2 == 1:
                res = (res * x) % mod
            x = (x * x) % mod
            n //= 2
        return res
    
    def factorial(n: int, mod: int) -> List[int]:
        fact = [1] * (n + 1)
        for i in range(1, n + 1):
            fact[i] = (fact[i - 1] * i) % mod
        return fact
    
    def inverse(n: int, mod: int) -> List[int]:
        inv = [0] * (n + 1)
        inv[1] = 1
        for i in range(2, n + 1):
            inv[i] = mod - (mod // i) * inv[mod % i] % mod
        return inv
    
    def inverse_factorial(n: int, mod: int) -> List[int]:
        finv = [1] * (n + 1)
        for i in range(2, n + 1):
            finv[i] = (finv[i - 1] * inverse(i, mod)[i]) % mod
        return finv
    
    def combination(n: int, r: int, fact: List[int], finv: List[int], mod: int) -> int:
        if n < r or r < 0:
            return 0
        return (fact[n] * finv[r] % mod * finv[n - r] % mod)
    
    def surjection(n: int, k: int, mod: int) -> int:
        ans = 0
        sign = 1
        if k % 2 == 0:
            sign = -1
        for i in range(1, k + 1):
            if sign == 1:
                ans += (combination(k, i, fact, finv, mod) * mod_pow(i, n, mod)) % mod
            else:
                ans -= (combination(k, i, fact, finv, mod) * mod_pow(i, n, mod)) % mod
            ans %= mod
            sign *= -1
        return ans
    
    if __name__ == "__main__":
        mod = 1000000007
        input_data = input().split()
        n = int(input_data[0])
        k = int(input_data[1])
    
        fact = factorial(max(2, n + 1), mod)
        finv = inverse_factorial(max(2, n + 1), mod)
    
        result = surjection(n, k, mod)
        print(result)