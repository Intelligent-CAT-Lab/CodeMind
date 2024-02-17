def f(a,b,c):
    return a*b<100*c
m,rd,rr,cd,cr=map(int,"M r".split())
ex=cd*100//rd
if(f(ex,rd,cd)):ex+=1
ey=cr*100//rr
if(f(ey,rr,cr)):ey+=1
print(m-ex-ey if m-ex-ey>=0 else -1)