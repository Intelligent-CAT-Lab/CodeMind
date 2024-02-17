n, d = map(int,input().split())
if n%(2*d+1)>0:
    ans = n//(2*d+1) +1
else:
    ans = n//(2*d+1)
print(ans)