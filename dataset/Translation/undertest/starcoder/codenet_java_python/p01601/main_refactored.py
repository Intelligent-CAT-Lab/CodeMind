class main:
    import sys
    
    def isPalin(s):
    	for i in range(len(s)/2):
    		if s[i]!= s[len(s)-i-1]:
    			return False
    	return True
    
    def run():
    	n = int(sys.stdin.readline())
    	for i in range(n):
    		if isPalin(str(n-i)) or isPalin(str(n+i)):
    			print n-i
    			break
    
    run()