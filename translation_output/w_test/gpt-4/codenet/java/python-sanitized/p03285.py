def check_sum_of_sevens_and_fours(N):
    limit7 = N // 7
    for i in range(limit7 + 1):
        left = N - (i * 7)
        if left % 4 == 0:
            return "Yes"
    return "No"

# Test input
N = int(input())
print(check_sum_of_sevens_and_fours(N))