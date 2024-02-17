n = int("10")
ans = 10**12
for k in range(1,int((n)**0.5)+2):
    if n%k == 0 :
        m = n//k + k - 2
        if ans > m:
            ans = m
print(ans)