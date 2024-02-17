h,w,x,y=map(int,"4 5 2 3".split())
print(["Yes","No"][h*w%2==1 and(x+y)%2==1])
