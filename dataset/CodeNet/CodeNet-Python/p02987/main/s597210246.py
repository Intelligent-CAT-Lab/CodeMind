a,b,c,d = eval(input())
flag = 0
if(a==b and c==d):
    flag = 1
elif(a==c and b==d):
    flag = 1
elif(a==d and b==c):
    flag = 1
else:
    flag = 0
if(a==b and a==c and a==d):
    flag = 0
if(flag==1):
    print("Yes")
else:
    print("No")