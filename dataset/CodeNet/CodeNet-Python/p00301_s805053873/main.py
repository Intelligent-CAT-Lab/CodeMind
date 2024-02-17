
n=int(input())
l=[]
while n:
    if n%3==0:l=["0"]+l;n//=3
    elif n%3==1:l=["+"]+l;n=(n-1)//3
    else:l=["-"]+l;n=(n+1)//3
print("".join(l))
