class main:
    import sys
    
    def main():
        n, m = map(int, input().split())
        print(sum(1 for _ in range(m - n % m)) + sum(ceil(n / m) for _ in range(m - (m - n % m))))
    
    if __name__ == "__main__":
        main()