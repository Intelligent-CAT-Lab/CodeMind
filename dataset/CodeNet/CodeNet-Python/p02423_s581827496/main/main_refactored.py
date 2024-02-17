class main:
	# -*- coding: utf-8 -*-
	"""
	Bitset I - Bit Operation I
	http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ITP2_10_A&lang=jp
	
	"""
	x = int(eval(input()))
	print(f'{x:032b}')
	print((f'{x:032b}'.translate(str.maketrans('01', '10'))))
	print((f'{x<<1:032b}'[-32:]))
	print(f'{x>>1:032b}')
	
