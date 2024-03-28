from collections import defaultdict

dp = defaultdict(lambda: defaultdict(int))

def search(num, count, max_val):
    if count == 0:
        return 1
    if dp[num][count]:
        return dp[num][count]
    total = 0
    i = 2
    while num * i * pow(2, count - 1) <= max_val:
        total += search(num * i, count - 1, max_val)
        i += 1
    dp[num][count] = total
    return total

def main():
    n, k = map(int, input().split())
    total = 0
    i = 1
    while i * pow(2, k - 1) <= n:
        total += search(i, k - 1, n)
        i += 1
    print(total)

if __name__ == "__main__":
    main()