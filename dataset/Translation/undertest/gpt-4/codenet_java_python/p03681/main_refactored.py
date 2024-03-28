class main:
    import sys
    from functools import reduce
    
    # Constants
    MOD = 10**9 + 7
    
    
    def solve(n, m):
        # Make sure n is smaller
        if n > m:
            n, m = m, n
    
        # If difference is more than 1, the answer is 0
        if m - n > 1:
            print(0)
            return
    
        ans = 1
        # Calculate factorial of n and m
        for i in range(1, n + 1):
            ans = (ans * i) % MOD
        for i in range(1, m + 1):
            ans = (ans * i) % MOD
    
        # If n and m are equal, multiply by 2
        if n == m:
            ans = (ans * 2) % MOD
    
        print(ans)
    
    
    def main():
        input_data = sys.stdin.readline().strip()
        n, m = map(int, input_data.split())
        solve(n, m)
    
    
    if __name__ == "__main__":
        main()