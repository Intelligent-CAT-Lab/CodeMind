class main:
    import math
    
    def count_distinct_prime_factors(n):
        if n == 1:
            return 0
    
        p_map = {}
        for i in range(2, math.isqrt(n) + 1):
            count = 0
            while n % i == 0:
                count += 1
                n //= i
            if count > 0:
                p_map[i] = count
    
        if n != 1:
            p_map[n] = 1
    
        ans = 0
        for p_count in p_map.values():
            i = 1
            while p_count >= i:
                p_count -= i
                ans += 1
                i += 1
    
        return ans
    
    n = int(input())
    print(count_distinct_prime_factors(n))