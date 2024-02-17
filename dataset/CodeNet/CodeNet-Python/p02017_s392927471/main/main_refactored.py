class main:
	H,W,x,y=list(map(int,input().split()))
	if (H*W)%2==1 and (x+y)%2==1:
	  print("No")
	else:
	  print("Yes")
