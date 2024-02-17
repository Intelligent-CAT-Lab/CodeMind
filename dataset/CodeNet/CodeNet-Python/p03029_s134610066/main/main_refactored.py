class main:
	from math import floor
	a,p=list(map(int,input().split()))
	piece=p+3*a
	print((floor(piece/2)))