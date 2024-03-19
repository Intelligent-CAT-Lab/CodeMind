L, R, d = map(int, input().split())
Ans = sum(1 for i in range(L, R+1) if i % d == 0)
print(Ans)