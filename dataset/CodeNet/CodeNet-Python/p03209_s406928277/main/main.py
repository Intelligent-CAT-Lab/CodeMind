n,x = list(map(int,input().split()))
size = [1]
pati = [1]
for i in range(n):
    size.append(size[i]*2 + 3)
    pati.append(pati[i]*2 + 1)
ans = 0
for i in range(n):
    if x == 1:
        x -= 1
        break
    elif x == size[n-i]:
        ans += pati[n-i]
        break
    elif x == size[n-i-1]+2:
        ans += pati[n-i-1]+1
        break
    elif x > size[n-i-1] + 2:
        ans += pati[n-i-1]+1
        x -= size[n-i-1] + 2
    else:
        x -= 1
if x == 1:
    ans += 1
print(ans)