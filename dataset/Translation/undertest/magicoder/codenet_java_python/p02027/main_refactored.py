class main:
    import sys
    
    dp = {}
    
    def search(num, count, max):
        if count == 0:
            return 1
        if num in dp:
            if count in dp[num]:
                return dp[num][count]
        total = 0
        for i in range(2, int(max / (num * 2 ** (count - 1))) + 1):
            total += search(num * i, count - 1, max)
        if num in dp:
            dp[num][count] = total
        else:
            dp[num] = {count: total}
        return total
    
    def main():
        n, k = map(int, sys.stdin.readline().split())
        total = 0
        for i in range(1, int(n / (2 ** (k - 1))) + 1):
            total += search(i, k - 1, n)
        print(total)
    
    if __name__ == "__main__":
        main()