class main:
    def compute_answer(N):
        MOD = 1000000007
        cnt = [0] * (N + 1)
        for i in range(2, N + 1):
            temp = i
            j = 2
            while j * j <= temp:
                while temp % j == 0:
                    cnt[j] += 1
                    temp //= j
                j += 1
            if temp > 1:
                cnt[temp] += 1
    
        ans = 1
        for i in range(2, N + 1):
            ans = (ans * (cnt[i] + 1)) % MOD
    
        return ans
    
    # Sample test case
    N = int(input())  # Test input: 3
    print(compute_answer(N))  # Expected output: 4