import sys

def main():
    MOD = 1000000007
    N = int(sys.stdin.readline().strip())
    cnt = [0]*(N+1)
    for i in range(2, N+1):
        temp = i
        j = 2
        while j*j <= temp:
            while temp % j == 0:
                cnt[j] += 1
                temp //= j
            j += 1
        if temp > 1:
            cnt[temp] += 1

    ans = 1
    for i in range(2, N+1):
        ans = (ans * (cnt[i]+1)) % MOD

    print(ans)

if __name__ == "__main__":
    main()