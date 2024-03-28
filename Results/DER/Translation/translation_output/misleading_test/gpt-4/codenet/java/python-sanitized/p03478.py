N, A, B = map(int, input().split())
ans = 0
for i in range(1, N+1):
    sum_of_digits = sum(map(int, str(i)))
    if A <= sum_of_digits <= B:
        ans += i
print(ans)