class main:
	I, O, T, J, L, S, Z = list(map(int, input().split()))
	if I and J and L:
	  a = ((I-1)//2 + (J-1)//2 + (L-1)//2)*2 + 3 + O
	else:
	  a = 0
	b = (I//2 + J//2 + L//2)*2 + O
	ans = max(a, b)
	print(ans)