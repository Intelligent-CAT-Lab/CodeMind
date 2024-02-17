class main:
	import sys
	import math
	for line in sys.stdin:
	    if line == None or line == '\n':
	        break
	    a,b = line.split(" ")
	    temp = int(a + b)
	    if int(math.sqrt(temp)) * int(math.sqrt(temp)) == temp:
	        print("Yes")
	    else:
	        print("No")