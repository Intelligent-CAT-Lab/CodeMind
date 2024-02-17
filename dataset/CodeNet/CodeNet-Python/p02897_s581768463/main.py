n = int(input())
if n%2 == 0:
    ans = (n/2)/n
else:
    ans = ((n+1)/2)/n
print(ans)