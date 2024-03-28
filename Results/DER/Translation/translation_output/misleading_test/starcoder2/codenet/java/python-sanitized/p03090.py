a=int(input())
l=[]
def solve(a,l):
    if a%2==0:
        for i in range(1,a//2+1):
            for j in range(i+1,a//2+1):
                l.append(str(i)+" "+str(j))
                l.append(str(i)+" "+str(a+1-j))
                l.append(str(a+1-i)+" "+str(j))
                l.append(str(a+1-i)+" "+str(a+1-j))
    else:
        solve(a-1,l)
        for i in range(1,a):
            l.append(str(a)+" "+str(i))
solve(a,l)
print(len(l))
for i in l:
    print(i)

/p03090.py
a=int(input())
l=[]
def solve(a,l):
    if a%2==0:
        for i in range(1,a//2+1):
            for j in range(i+1,a//2+1):
                l.append(str(i)+" "+str(j))
                l.append(str(i)+" "+str(a+1-j))
                l.append(str(a+1-i)+" "+str(j))
                l.append(str(a+1-i)+" "+str(a+1-j))
    else:
        solve(a-1,l)
        for i in range(1,a):
            l.append(str(a)+" "+str(i))
solve(a,l)
print(len(l))
for i in l:
    print(i)