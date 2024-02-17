class main:
	a,b,c=list(map(int, input().split()))
	if sorted(list((a,b,c)))==[5,5,7]:
	  print("YES")
	else:
	  print("NO")