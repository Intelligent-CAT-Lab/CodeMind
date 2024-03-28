class main:
    import sys
    
    def main():
        input = sys.stdin.readline
        MOD = 1000000007
        n, k = map(int, input().split())
        ans = 1
        for i in range(n):
            ans = (ans * k) % MOD
        print(ans)
    
    if __name__ == '__main__':
        main()