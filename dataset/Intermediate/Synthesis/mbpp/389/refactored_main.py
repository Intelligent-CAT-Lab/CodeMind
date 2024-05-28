n = 9
if (n == 0): 
	print(2)
elif (n == 1): 
	print(1)
print(find_lucas(n - 1) + find_lucas(n - 2))