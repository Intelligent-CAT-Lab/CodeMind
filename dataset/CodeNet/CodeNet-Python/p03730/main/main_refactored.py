class main:
	a, b, c = list(map(int, input().split()))
	
	def foo(a, b, c):
	    seen = set()
	    m = a % b
	    i = m
	    while i not in seen :
	        if i == c:
	            print("YES")
	            return 
	        seen.add(i)
	        i = (m + i) % b
	    print("NO")
	foo(a, b, c)
