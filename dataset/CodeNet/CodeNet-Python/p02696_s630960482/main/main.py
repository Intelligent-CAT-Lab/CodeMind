A, B, N = list(map(int, input().split()))

if N >= B:
    x = B - 1
    ans = ((A * x) // B) - (A * (x // B))
else:
    x = N
    ans = ((A * x) // B) - (A * (x // B))


print(ans)