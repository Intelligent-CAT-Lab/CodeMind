class main:
	W,H,x,y,r = tuple(int(n) for n in input().split())
	
	left = x-r >= 0
	right = x+r <= W
	top = y+r <= H
	bottom = y-r >= 0
	
	if left*right*top*bottom == 1:
	    print("Yes")
	else:
	    print("No")
	
	
	
