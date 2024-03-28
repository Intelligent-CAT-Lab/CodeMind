import math

def primes(n):
    sieve = [True] * (n + 1)
    primes = []
    for i in range(2, n + 1):
        if sieve[i]:
            primes.append(i)
            for j in range(i * i, n + 1, i):
                sieve[j] = False
    return primes

def main():
    a, b = map(int, input().split())
    l = max(a - b, 2)
    h = a + b
    prime_list = primes(int(math.sqrt(h) + 1))
    
    ok = [True] * (h - l + 1)
    count = [0] * (h - l + 1)
    
    for p in reversed(prime_list):
        div_start = (((l + p - 1) // p) * p)
        for pos in range(div_start, h + 1, p):
            cc = 1
            v = pos // p
            while v % p == 0:
                v //= p
                cc += 1
            idx_pos = pos - l
            if count[idx_pos] > cc:
                ok[idx_pos] = False
            count[idx_pos] = cc
    
    result = sum(1 for is_ok in ok if is_ok)
    print(result)

if __name__ == "__main__":
    main()