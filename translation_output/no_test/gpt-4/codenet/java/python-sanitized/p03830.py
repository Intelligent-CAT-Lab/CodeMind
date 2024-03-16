from collections import defaultdict

MOD = 1000000007

# Function to get the count of all prime factors for each number up to N
def prime_factors_count(N):
    cnt = defaultdict(int)
    for i in range(2, N + 1):
        temp = i
        for j in range(2, int(temp ** 0.5) + 1):
            while temp % j == 0:
                cnt[j] += 1
                temp //= j
        if temp > 1:
            cnt[temp] += 1
    return cnt

def main():
    N = int(input())
    cnt = prime_factors_count(N)
    
    ans = 1
    for i in range(2, N + 1):
        ans = (ans * (cnt[i] + 1)) % MOD
    
    print(ans)

main()