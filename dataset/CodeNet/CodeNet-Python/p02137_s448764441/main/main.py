n = int(eval(input()))
ans = 0
l = [10000, 5000, 1000, 500]
for i in range(4) :
    ans += (n // l[i]) * l[i]
    n = n % l[i]
print(ans)
