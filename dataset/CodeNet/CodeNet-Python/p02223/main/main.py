n=eval(input())

if n==1:
	print("1\n0")
elif n==2:
	print("2\n0\n11")
else:
	print(n-1)
	for i in range(n-1):
		print("1"+("0"*i)+"1")

