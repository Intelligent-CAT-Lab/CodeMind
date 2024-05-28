x = 383
if (x % 2 == 0): 
	return False
if (x == 1): 
	return True
x = x + 1 
p = 0
while (x % 2 == 0): 
	x = x/2
	p = p + 1
	if (p == x): 
		return True
print(False)