class main:
    import sys
    
    def main():
        a, b = map(int, sys.stdin.readline().split())
        x1, y1 = 1, 0
        x2, y2 = 0, 1
        r1, r2 = a, b
        while r2 != 0:
            q = r1 // r2
            r3 = r1 % r2
            x3 = x1 - q * x2
            y3 = y1 - q * y2
            r1 = r2
            r2 = r3
            x1 = x2
            x2 = x3
            y1 = y2
            y2 = y3
        print(x1, y1)
    
    if __name__ == "__main__":
        main()