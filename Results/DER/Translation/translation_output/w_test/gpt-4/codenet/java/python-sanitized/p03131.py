K, A, B = map(int, input().split())

sum_result = 1 + K
if A < B:
    sum1 = 1
    if A > sum1:
        K -= (A - sum1)
        sum1 = A
    sum1 += (B - A) * (K // 2)
    if K % 2 == 1:
        sum1 += 1
    sum_result = max(sum_result, sum1)

print(sum_result)