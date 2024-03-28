class main:
    from collections import defaultdict
    
    dp = defaultdict(dict)
    
    def main():
        n, k = map(int, input().split())
        total = 0
        for i in range(1, int(n**(1/(2**(k-1))))+1):
            total += search(i, k-1, n)
        print(total)
    
    def search(num, count, max):
        if count == 0:
            return 1
        if num in dp and count in dp[num]:
            return dp[num][count]
        total = 0
        for i in range(2, int(max**(1/(2**count))/num)+1):
            total += search(num*i, count-1, max)
        dp[num][count] = total
        return total
    
    if __name__ == "__main__":
        main()