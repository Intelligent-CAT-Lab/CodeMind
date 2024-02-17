class main:
	def main():
	    N = int(eval(input()))
	    ans = 0
	    for i in range(1, N+1):
	        if not (i % 3 == 0 or i % 5 == 0):
	            ans += i
	    print(ans)
	
	
	if __name__ == '__main__':
	    main()
