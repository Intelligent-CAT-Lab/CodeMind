class main:
    import sys
    
    def main():
    	N = int(sys.stdin.readline())
    	d1 = int(sys.stdin.readline())
    	x = int(sys.stdin.readline())
    	
    	ans = 0
    	
    	for i in range(N):
    		ans += d1 + (i-0.5)*x
    		d1 = ((2*i+2)*d1 + 5*x)/(2*i)
    		x = ((i+2)/i)*x
    	
    	print(ans)
    
    if __name__ == "__main__":
    	main()