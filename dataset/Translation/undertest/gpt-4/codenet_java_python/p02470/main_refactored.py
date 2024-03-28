class main:
    import math
    
    def solve():
        n = int(input())
        print(totient(n))
    
    def totient(n):
        phi = n
        p = 2
        while p * p <= n:
            if n % p == 0:
                while n % p == 0:
                    n //= p
                phi -= phi // p
            p += 1 if p == 2 else 2  # After 2, consider only odd numbers
        if n > 1:
            phi -= phi // n
        return phi
    
    if __name__ == '__main__':
        solve()