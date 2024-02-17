a,b = map(int,"5 8".split())
def round(a, b):
	if a * b < 0:
		return -(-a//b)
	else:
		return a//b
print(round(a, b))
