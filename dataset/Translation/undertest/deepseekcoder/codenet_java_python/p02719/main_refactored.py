class main:
    import sys
    
    def main():
        n, k = map(int, sys.stdin.readline().split())
        ans = min(n % k, k - (n % k))
        print(ans)
    
    if __name__ == "__main__":
        main()