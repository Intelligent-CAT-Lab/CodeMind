class main:
    import sys
    
    def primes(n):
        ret = []
        bs = [0] * (n + 1)
        for i in range(2, n + 1):
            if bs[i] == 0:
                ret.append(i)
                for j in range(i * 2, n + 1, i):
                    bs[j] = 1
        return ret
    
    def solve(a, b):
        global L, H, primes
        L = max(a - b, 2)
        H = a + b
        primes = primes(int(H ** 0.5) + 1)
        count = [0] * (H - L + 1)
        ok = [True] * (H - L + 1)
        for p in primes[::-1]:
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
        ret = 0
        for i in range(len(ok)):
            if ok[i]:
                ret += 1
        return ret
    
    def main():
        a, b = map(int, sys.stdin.readline().strip().split())
        print(solve(a, b))
    
    if __name__ == '__main__':
        main()