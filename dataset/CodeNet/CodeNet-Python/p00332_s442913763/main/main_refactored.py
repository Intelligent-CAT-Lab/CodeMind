class main:
	e, y = list(map(int, input().split()))
	
	if e == 0:
	    if 1868 <= y <= 1911:
	        ans = "M" + str(y-1868+1)
	    elif 1912 <= y <= 1925:
	        ans = "T" + str(y-1912+1)
	    elif 1926 <= y <= 1988:
	        ans = "S" + str(y-1926+1)
	    else:
	        ans = "H" + str(y-1989+1)
	
	elif e == 1:
	    ans = 1868 + y - 1
	elif e == 2:
	    ans = 1912 + y - 1
	elif e == 3:
	    ans = 1926 + y - 1
	else:
	    ans = 1989 + y - 1
	
	print(ans)
