import sys

w,h,x,y=map(int,sys.stdin.readline().split())
print(w*h/2)
if x+x==w and y+y==h:
	print(1)
else:
	print(0)