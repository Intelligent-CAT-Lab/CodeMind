class main:
	# coding: utf-8
	# Your code here!
	A,B,C=list(map(int,input().split()))
	
	if (A+B)>C-1:
	    print((B+C))
	else:
	    print((B+(A+B)+1))
