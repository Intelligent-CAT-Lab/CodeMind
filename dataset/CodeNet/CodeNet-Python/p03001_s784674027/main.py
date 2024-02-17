a,b,x,y = map(float,input().split())
h = 1 if a/2==x and b/2==y else 0
print(str(a*b/2) + ' ' + str(h))