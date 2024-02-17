a,b,c,d,e,f=list(map(int,input().split()))
maxsugar=0
maxwater=100*a
for i in range(31):
    for j in range(31):
        for k in range(3001):
            water=100*a*i+100*b*j
            sugar=c*k
            if water+sugar>f:
                continue
            if sugar>(a*i+b*j)*e:
                continue
            sugar+=min((f-(water+sugar))//d*d,((a*i+b*j)*e-c*k)//d*d)
            if 100*maxsugar*(water+sugar)<100*sugar*(maxsugar+maxwater):
                maxsugar=sugar
                maxwater=water
print((maxsugar+maxwater,maxsugar))