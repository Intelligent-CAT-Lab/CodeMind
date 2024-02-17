a,b,x,y = map(float,"2 3 1 2".split())
h = 1 if a/2==x and b/2==y else 0
print(str(a*b/2) + ' ' + str(h))