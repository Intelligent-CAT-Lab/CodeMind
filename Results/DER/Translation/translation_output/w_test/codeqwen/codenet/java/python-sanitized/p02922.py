a, b = map(int, input().split())

ans = (b-1)//(a-1)
if (b-1)%(a-1)==0:
    print(ans)
else:
    print(ans+1)