class main:
    from math import isqrt
    
    def primes(N):
        ret = []
        bs = [False] * (N + 1)
        for i in range(2, N + 1):
            if not bs[i]:
                ret.append(i)
                for j in range(i * 2, N + 1, i):
                    bs[j] = True
        return ret
    
    def count_good_numbers(A, B):
        L = max(A - B, 2)
        H = A + B
        prime_list = primes(isqrt(H) + 1)
        count = [0] * (H - L + 1)
        ok = [True] * (H - L + 1)
        for p in reversed(prime_list):
            div = -(-L // p)
            pos = div * p
            while pos <= H:
                cc = 1
                v = div
                while v % p == 0:
                    cc += 1
                    v //= p
                if count[pos - L] > cc:
                    ok[pos - L] = False
                count[pos - L] = cc
                pos += p
                div += 1
    
        ret = sum(ok) # Sum of True values (equivalent to ++ret in the loop for ok[i] in Java)
        return ret
    
    # Input reading
    A, B = map(int, input().split())
    print(count_good_numbers(A, B))