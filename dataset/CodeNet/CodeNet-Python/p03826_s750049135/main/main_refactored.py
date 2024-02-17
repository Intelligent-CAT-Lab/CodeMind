class main:
	
	def resolve():
	    A, B, C, D = list(map(int, input().split()))
	    print((A*B if A*B > C*D else C*D))
	
	
	if '__main__' == __name__:
	    resolve()