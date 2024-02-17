class main:
	import sys
	import math
	from collections import deque
	from decimal import Decimal
	
	sys.setrecursionlimit(1000000)
	MOD = 10 ** 9 + 7
	input = lambda: sys.stdin.readline().strip()
	NI = lambda: int(eval(input()))
	NMI = lambda: list(map(float, input().split()))
	NLI = lambda: list(NMI())
	SI = lambda: eval(input())
	
	
	def make_grid(h, w, num): return [[int(num)] * w for _ in range(h)]
	
	
	#隣接リスト 1-order
	def make_adjlist_d(n, edges):
	    res = [[] for _ in range(n + 1)]
	    for edge in edges:
	        res[edge[0]].append(edge[1])
	        res[edge[1]].append(edge[0])
	    return res
	
	
	def make_adjlist_nond(n, edges):
	    res = [[] for _ in range(n + 1)]
	    for edge in edges:
	        res[edge[0]].append(edge[1])
	    return res
	
	
	#nCr
	def cmb(n, r):
	    return math.factorial(n) // math.factorial(r) // math.factorial(n - r)
	
	
	def main():
	    A, B = input().split()
	    print((int(Decimal(A) * Decimal(B))))
	
	
	if __name__ == "__main__":
	    main()