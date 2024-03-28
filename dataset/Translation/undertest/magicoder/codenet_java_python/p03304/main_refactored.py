class main:
    import sys
    
    def main():
        n, m, d = map(int, sys.stdin.readline().split())
        s = d if d == 0 else (n - d) * 2
        print(s / n / n * (m - 1))
    
    if __name__ == "__main__":
        main()