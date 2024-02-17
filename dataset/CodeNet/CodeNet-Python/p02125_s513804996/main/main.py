n = int(eval(input()))
ans = 0
tmp = 1
while tmp <= n+1 :
    tmp *= 2
    ans += 1
print((ans-1))
