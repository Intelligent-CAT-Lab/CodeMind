class main:
    import sys
    
    def dfs(rem, pos, len):
    	if len-pos-1 < pos:
    		return rem == 0? 1L : 0L
    	if pos == len-1-pos:
    		return rem == 0? 10L : 0L
    	d = 1
    	for i in range(1, len-pos-1):
    		d *= 10
    	dm = 1
    	for i in range(1, pos):
    		dm *= 10
    	d -= dm
    	if abs(rem) >= 10L*d:
    		return 0
    	ret = 0
    	for i in range(-9, 10):
    		if pos == 0 and i >= 0:
    			ret += dfs(rem-d*i, pos+1, len) * (9-abs(i))
    		else:
    			ret += dfs(rem-d*i, pos+1, len) * (10-abs(i))
    	return ret
    
    def solve():
    	D = int(input())
    	ans = 0
    	for len in range(len(str(D)), 19):
    		res = dfs(D, 0, len)
    		ans += res
    	print(ans)
    
    if __name__ == '__main__':
    	INPUT = sys.stdin.read()
    	solve()