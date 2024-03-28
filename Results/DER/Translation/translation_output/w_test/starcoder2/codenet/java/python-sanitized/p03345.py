a,b,c,k = map(int,input().split())
ans = a-b
if abs(ans)>pow(10,18):
    print("Unfair")
else:
    if k%2==0:
        print(ans)
    else:
        print(ans*-1)