class main:
	a,b,c,d=list(map(int, input().split()))
	print(("YNeos"[not (abs(a-c)<=d or abs(a-b)<=d and abs(b-c)<=d)::2]))