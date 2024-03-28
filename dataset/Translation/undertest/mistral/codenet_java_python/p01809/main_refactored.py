class main:
    import sys
    
    def main():
        yaku = []
        p, q = map(int, sys.stdin.readline().split())
        qs = q // (p % q)
        ans = 1
        bp, bq, buf = p, q, p
    
        while bq % bp != 0:
            buf = bq % bp
            bq, bp = bp, buf
    
        for i in range(2, int(qs**0.5) + 1):
            if qs % i == 0:
                while qs % i == 0:
                    qs //= i
                ans *= i
    
        ans *= qs
        print(ans)
    
    if __name__ == "__main__":
        main()