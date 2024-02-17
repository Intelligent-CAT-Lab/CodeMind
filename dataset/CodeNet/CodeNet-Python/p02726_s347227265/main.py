n,x,y = map(int,input().split())
x,y = x-1,y-1

D = [0 for _ in range(n+1)]
    
for i in range(n-1):
    for j in range(i+1,n):
        dist1 = j-i
        dist2 = abs(i-x) +1 + abs(j-y)
        dist = min(dist1,dist2)
        D[dist] = D[dist]+1


    
for i in range(1,n):
    print(D[i])