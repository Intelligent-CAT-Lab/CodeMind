class main:
	import sys
	read = sys.stdin.read
	readline = sys.stdin.readline
	readlines = sys.stdin.readlines
	
	def main():
	    N = int(readline())
	
	    K = 0
	    for i in range(1,10**3):
	        if i * (i-1) // 2 == N:
	            K = i
	            break
	
	    if K == 0:
	        print("No")
	        exit()
	    
	    S = [[] for _ in range(K)]
	
	    i = 1
	    k = 0
	    cnt = 0
	    while i <= N:
	        S[k].append(i)
	        i += 1
	        cnt += 1
	        if cnt == K - (k+1):
	            k += 1
	            cnt = 0
	
	    j = 1
	    k = 1
	    cnt = 0
	    col = 0
	    while j <= N:
	        S[k].append(j)
	        j += 1
	        k += 1
	        cnt += 1
	        if cnt == K - (col+1):
	            col += 1
	            k = col + 1
	            cnt = 0
	
	    print("Yes")
	    print(K)
	
	    for s in S:
	        print((K - 1, *s))
	
	    
	if __name__ == "__main__":
	    main()
