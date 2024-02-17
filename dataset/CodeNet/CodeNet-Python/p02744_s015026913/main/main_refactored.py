class main:
	import sys
	from collections import deque
	
	input = sys.stdin.readline
	
	
	def dfs(N):
	    alphabet = "abcdefghij"
	    stack = deque(["a"])
	    while stack:
	        s = stack.pop()
	        if len(s) == N:
	            print(s)
	            continue
	        for suffix in reversed(alphabet[:len(set(s)) + 1]):
	            stack.append("".join((s, suffix)))
	
	
	def main():
	    N = int(eval(input()))
	
	    dfs(N)
	
	
	if __name__ == "__main__":
	    main()
