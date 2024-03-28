class main:
    import sys
    from math import comb
    
    def main():
        a, b, c = map(int, sys.stdin.readline().split())
        if a * b > c:
            print(0)
            sys.exit(0)
        c -= a * b
        d = c + a - 1
        print(comb(d, c))
    
    if __name__ == "__main__":
        main()