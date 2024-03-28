class main:
    import sys
    
    class p01491:
    	def __init__(self):
    		self.run()
    
    	def run(self):
    		self.solver()
    
    	def solver(self):
    		M = int(sys.stdin.readline())
    		N = int(sys.stdin.readline())
    		m0 = int(sys.stdin.readline())
    		md = int(sys.stdin.readline())
    		n0 = int(sys.stdin.readline())
    		nd = int(sys.stdin.readline())
    		m = [m0]
    		n = [n0]
    		for i in range(1, M):
    			m.append((m[i - 1] * 58 + md) % (N + 1))
    		for i in range(1, N):
    			n.append((n[i - 1] * 58 + nd) % (M + 1))
    		m = self.sort(m, N)
    		n = self.sort(n, M)
    		accumN = [0] * (N + 1)
    		accumM = [0] * (M + 1)
    		for i in range(N):
    			accumN[i + 1] = accumN[i] + n[i]
    		for i in range(M):
    			accumM[i + 1] = accumM[i] + m[i]
    		cur = N
    		sum = accumM[0] + accumN[cur] + (N - cur) * (M - 0)
    		for i in range(M + 1):
    			while cur >= 1 and accumM[i] + accumN[cur] + (N - cur) * (M - i) >= accumM[i] + accumN[cur - 1] + (N - (cur - 1)) * (M - i):
    				cur -= 1
    			sum = min(sum, accumM[i] + accumN[cur] + (N - cur) * (M - i))
    		print(sum)
    
    	def sort(self, a, max):
    		counter = [0] * (max + 1)
    		for i in range(len(a)):
    			counter[a[i]] += 1
    		pos = 0
    		for i in range(len(counter)):
    			while counter[i] > 0:
    				a[pos] = i
    				pos += 1
    				counter[i] -= 1
    		return a
    
    p01491()