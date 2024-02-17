class main:
	print((' '.join([x for x in input().replace('.',' ').replace(',',' ').split() if 3 <= len(x) <= 6])))
