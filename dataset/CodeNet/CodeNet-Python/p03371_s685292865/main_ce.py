a,b,c,x,y=map(int,"1500 2000 1600 3 2".split())
l=[]
for i in range(10**7):
    s=c*i*2+a*max(0,x-i)+b*max(0,y-i)
    l.append(s)
print(min(l))
