from collections import defaultdict

dp = defaultdict(lambda: defaultdict(int))

def main():
    n, k = map(int, input().split())
    total = 0
    for i in range(1, int(n**(1/(k-1)))+1):
        total += search(i, k-1, n)
    print(total)

def search(num, count, max):
    if count == 0:
        return 1
    if dp[num][count]:
        return dp[num][count]
    total = 0
    for i in range(2, int(max**(1/(count-1)))//num+1):
        total += search(num*i, count-1, max)
    dp[num][count] = total
    return total

if __name__ == "__main__":
    main()