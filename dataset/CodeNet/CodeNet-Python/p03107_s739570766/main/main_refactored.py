class main:
	from sys import stdin
	
	S = stdin.readline()
	
	print((min(S.count('0'),S.count('1'))*2))