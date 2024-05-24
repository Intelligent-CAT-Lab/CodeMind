n = int(input())

ans = 0
tmp = 1
while n > tmp:
    tmp *= 3
    ans+=1
print(ans)
