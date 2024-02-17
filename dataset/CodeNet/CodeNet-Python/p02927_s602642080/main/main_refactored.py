class main:
	def solve():
	  M, D = list(map(int, input().split()))
	  ans = 0
	  for i in range(12,D+1):
	    a,b = int(str(i)[0]),int(str(i)[1])
	    if a>1 and b>1:
	      if a*b<=M:
	        ans += 1
	  return ans
	print((solve()))