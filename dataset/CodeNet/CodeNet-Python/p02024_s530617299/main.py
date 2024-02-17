h,w,x,y=map(int,input().split())
print(["Yes","No"][h*w%2==1 and(x+y)%2==1])
