def search(num, count, max_val, dp):
    if count == 0:
        return 1
    if num in dp and count in dp[num]:
        return dp[num][count]

    total = 0
    i = 2
    while num * i * (2 ** (count - 1)) <= max_val:
        total += search(num * i, count - 1, max_val, dp)
        i += 1

    if num not in dp:
        dp[num] = {}
    dp[num][count] = total
    
    return total

def main():
    n = int(input())
    k = int(input())
    total = 0
    dp = {}
    for i in range(1, n + 1):
        if i * (2 ** (k - 1)) <= n:
            total += search(i, k - 1, n, dp)
    print(total)

if __name__ == "__main__":
    main()