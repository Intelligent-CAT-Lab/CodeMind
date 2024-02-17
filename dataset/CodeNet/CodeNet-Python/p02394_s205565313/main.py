i = list(map(int, input().split()))
def in_retangle(w,h,x,y,r):
    if r<=y and y<=h-r and r<=x and x<=w-r:
        print("Yes")
    else:
        print("No")
    
in_retangle(i[0],i[1],i[2],i[3],i[4])
