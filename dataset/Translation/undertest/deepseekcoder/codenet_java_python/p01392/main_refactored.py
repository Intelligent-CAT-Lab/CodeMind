class main:
    import math
    
    def primes(N):
        sieve = [True] * (N + 1)
        for x in range(2, int(N**0.5) + 1):
            if sieve[x]:
                for i in range(x*x, N + 1, x):
                    sieve[i] = False
        return [x for x in range(2, N + 1) if sieve[x]]
    
    def main():
        A, B = map(int, input().split())
        L = max(A - B, 2)
        H = A + B
        primes_list = primes(int(math.sqrt(H)) + 1)
        count = [0] * (H - L + 1)
        ok = [True] * (H - L + 1)
        for p in primes_list[::-1]:
            div = (L + (p - 1)) // p
            for pos in range(div * p, H + 1, p):
                cc = 1
                v = div
                while v % p == 0:
                    cc += 1
                    v //= p
                if count[pos - L] > cc:
                    ok[pos - L] = False
                count[pos - L] = cc
        print(sum(ok))
    
    if __name__ == "__main__":
        main()