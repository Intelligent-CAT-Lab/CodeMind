class main:
	import heapq
	
	class Node:
	    def __init__(self, k, v):
	        self.k = k
	        self.v = v
	        self.left = None
	        self.right = None
	
	def hist(s):
	    d = {}
	    for c in s:
	        if c not in d:
	            d[c] = 0
	        d[c] += 1
	    return d
	
	S = input()
	D = hist(S)
	pool = []
	for k,v in list(D.items()):
	    heapq.heappush(pool, (v, Node(k,v)))
	
	while len(pool) >= 2:
	    _, x = heapq.heappop(pool)
	    _, y = heapq.heappop(pool)
	    zv = x.v + y.v
	    z = Node("", zv)
	
	    if x.v > y.v and x.k != "":
	        x,y = y,x
	    z.left = x
	    z.right = y
	    heapq.heappush(pool, (zv,z))
	
	D = {}
	def traverse(node, code):
	    if node.k == "":
	        traverse(node.right, code+"1")
	        traverse(node.left, code+"0")
	    else:
	        if code == "":
	            code += "0"
	        D[node.k] = code
	
	traverse(pool[0][1], "")
	#print D
	ans = sum([len(D[c]) for c in S])
	print(ans)
