class main:
	#import collections
	#aa = collections.Counter(a) # list to list
	def readInts():
	  return list(map(int,input().split()))
	mod = 10**9 + 7
	def main():
	    n,y = readInts()
	    wa = 0
	
	    for i in range(n+1):
	        for j in range(n+1):
	            if i+j > n:
	                break
	            y1000 = (y - 10000 * i - 5000 * j)//1000
	            if i + j + y1000 == n:
	                print((i,j,y1000))
	                exit()
	    print((-1,-1,-1))
	    exit()
	
	
	if __name__ == '__main__':
	  main()
