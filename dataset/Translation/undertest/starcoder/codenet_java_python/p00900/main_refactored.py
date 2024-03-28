class main:
    import sys
    
    class P:
    	def __init__(self, x, y):
    		self.x = x
    		self.y = y
    
    def solve(S, cnt):
    	p = S % 100
    	if memo.has_key(S):
    		return memo[S]
    	if S % 100 == size:
    		if S / 100 == 0:
    			return 0
    		return INF
    	if cnt == 9:
    		if S / pow10[p] % 10 == 0:
    			ret = solve(S+1, 0)
    			memo[S] = ret
    			return ret
    		else:
    			return INF
    	min = solve(S, cnt+1)
    	x = ps[p].x + dx[cnt]
    	y = ps[p].y + dy[cnt]
    	if out(x, y) or bomb[y][x] or map[y][x] < 0:
    		return min
    	next = S
    	bomb[y][x] = True
    	ng = False
    	for i in range(size):
    		for j in range(9):
    			tx = x + dx[j]
    			ty = y + dy[j]
    			if out(tx, ty):
    				continue
    			tar = P(tx, ty)
    			if not ps[i].isEquals(tar):
    				continue
    			if next / pow10[i] % 10 > 0:
    				next -= pow10[i]
    			else:
    				ng = True
    	if not ng:
    		min = min(min, solve(next, cnt+1) + 1)
    	bomb[y][x] = False
    	return min
    
    def out(x, y):
    	return x < 0 or y < 0 or x >= w or y >= h
    
    #INF = 1L << 62
    EPS = 1e-10
    h, w, size = 0, 0, 0
    map = []
    bomb = []
    ps = []
    dx = [-1, -1, -1, 0, 0, 0, 1, 1, 1]
    dy = [-1, 0, 1, -1, 0, 1, -1, 0, 1]
    pow10 = []
    memo = {}
    
    def main():
    	while True:
    		h, w = map(int, raw_input().split())
    		if h == 0 and w == 0:
    			break
    		map = []
    		bomb = []
    		ps = []
    		for i in range(h):
    			l = raw_input()
    			row = []
    			for j in range(w):
    				if l[j] == '.':
    					row.append(-1)
    				elif l[j] == '*':
    					row.append(0)
    				else:
    					row.append(int(l[j]))
    					ps.append(P(j, i))
    			map.append(row)
    		size = len(ps)
    		pow10 = [100]
    		for i in range(1, size):