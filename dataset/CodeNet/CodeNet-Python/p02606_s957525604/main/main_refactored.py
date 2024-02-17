class main:
	#!/usr/bin/env python3
	l, r, d = list(map(int, input().split()))
	print((r//d - (l-1)//d))
