class main:
	from sys import stdin, stdout
	import math
	
	n = int(stdin.readline().strip())
	
	reserved = 1
	maxspeed = 1
	
	while True:
	    if reserved + maxspeed * 3 > n:
	        break
	    maxspeed *= 3
	    reserved += maxspeed * 2
	
	ans = 1
	n -= 1
	
	i = 3
	while i < maxspeed:
	    ans += 2
	    n -= i * 2
	    i *= 3
	n -= maxspeed
	
	i = maxspeed
	while i:
	    ans += n // i
	    n -= n // i * i
	    i //= 3
	stdout.writelines(str(ans + 1) + '\n')
	
