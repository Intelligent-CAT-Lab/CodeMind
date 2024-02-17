class main:
	import sys
	
	readline = sys.stdin.readline
	MOD = 10 ** 9 + 7
	INF = float('INF')
	sys.setrecursionlimit(10 ** 5)
	
	
	def main():
	    a, b = input().split()
	    x = int(a + b)
	
	    def judge():
	        for i in range(10001):
	            if i ** 2 == x:
	                return True
	        return False
	
	    if judge():
	        print("Yes")
	    else:
	        print("No")
	
	
	if __name__ == '__main__':
	    main()
