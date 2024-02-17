A,B=list(map(int,input().split()))
x=(A**2-B**2)/(2*(A-B))
if x%1==0:
    print((int(x)))
else:
    print('IMPOSSIBLE')