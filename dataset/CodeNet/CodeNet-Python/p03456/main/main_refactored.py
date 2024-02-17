class main:
	#!/usr/bin/python3
	# -*- coding: utf-8 -*-
	
	import sys
	from math import sqrt
	
	def main():
	    a, b = sys.stdin.readline().split()
	    n = int(a + b)
	    sqrtn = int(sqrt(n))
	    i = 1
	    for i in range(1, sqrtn + 1):
	        if i * i == n:
	            print('Yes')
	            break
	    else:
	        print('No')
	
	
	if __name__ == '__main__':
	    main()
