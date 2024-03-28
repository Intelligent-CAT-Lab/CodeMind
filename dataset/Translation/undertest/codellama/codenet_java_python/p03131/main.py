import math

def solve(K, A, B):
    sum = 1 + K
    if A < B:
        sum1 = 1
        if A > sum1:
            K -= (A - sum1)
            sum1 = A
        sum1 += (B - A) * (K // 2)
        if K % 2 == 1:
            sum1 += 1
        sum = max(sum, sum1)
    return sum

print(solve(4, 2, 6))