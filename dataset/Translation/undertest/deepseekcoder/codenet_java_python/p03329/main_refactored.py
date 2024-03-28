class main:
    def calc(n, memo):
        if n == 0:
            return 0
        if memo[n] != -1:
            return memo[n]
    
        res = n
        for pow6 in range(1, n + 1):
            pow6 = 6 ** pow6
            if pow6 > n:
                break
            res = min(res, calc(n - pow6, memo) + 1)
        for pow9 in range(1, n + 1):
            pow9 = 9 ** pow9
            if pow9 > n:
                break
            res = min(res, calc(n - pow9, memo) + 1)
        memo[n] = res
        return memo[n]
    
    def main():
        n = int(input())
        memo = [-1] * (n + 1)
        ans = calc(n, memo)
        print(ans)
    
    if __name__ == "__main__":
        main()