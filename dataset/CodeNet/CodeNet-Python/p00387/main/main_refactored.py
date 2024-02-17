class main:
	l=input().split()
	A=int(l[0])
	B=int(l[1])
	kimawasi=B//A
	if B%A>0:
	    kimawasi=kimawasi+1
	print(kimawasi)
