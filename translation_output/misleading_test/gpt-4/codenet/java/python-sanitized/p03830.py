import math

def get_divisors_count(n):
    cnt = [0] * (n + 1)
    for i in range(2, n + 1):
        temp = i
        for j in range(2, int(math.sqrt(temp)) + 1):
            while temp % j == 0:
                cnt[j] += 1
                temp //= j
        if temp > 1:
            cnt[temp] += 1
    return cnt

def calculate_answer(N, MOD=1000000007):
    cnt = get_divisors_count(N)
    ans = 1
    for i in range(2, N + 1):
        ans = (ans * (cnt[i] + 1)) % MOD
    return ans

def main():
    N = int(input())
    print(calculate_answer(N))

if __name__ == "__main__":
    main()