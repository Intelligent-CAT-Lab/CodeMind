class main:
	from itertools import product
	def main():
	    N = int(eval(input()))
	    if N == 0:
	        return 0
	    l = set()
	    while N != 0:
	        if N > 0:
	            r = plus(N)
	            l.add(r)
	            N -= pow(2, r)
	        else:
	            r = minus(N)
	            l.add(r)
	            N += pow(2, r)
	    s = [0] * (max(l)+1)
	    for i in range(max(l)+1):
	        if i in l:
	            s[i] = 1
	    s.reverse()
	    return ''.join(str(i) for i in s)
	    #for i in product(range(2), repeat=9):
	    #    r = 0
	    #    for j, v in enumerate(i):
	    #        r += v * pow(-2, j)
	    #    l.append((r, i))
	    #l.sort()
	    #for x in l:
	    #    print(x)
	def plus(N):
	    p = 0
	    n = 0
	    while True:
	        p += pow(2, n)
	        if p >= N:
	            break
	        n += 2
	    return n
	def minus(N):
	    p = 0
	    n = 1
	    while True:
	        p -= pow(2, n)
	        if p <= N:
	            break
	        n += 2
	    return n
	
	print((main()))
