class main:
	def inpl(): return list(map(int, input().split()))
	W, H, w, h, x, y = inpl()
	
	a = (min(W//2 , x + w//2) + max(-W//2, x-w//2))
	b = (min(H//2 , y + h//2) + max(-H//2, y-h//2))
	print((b/a))
