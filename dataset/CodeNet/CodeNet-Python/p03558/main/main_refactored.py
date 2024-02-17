class main:
	from collections import deque
	q = deque()
	K = int(eval(input()))
	q.append((1, 1))
	m = {}
	while len(q):
	 n, s = q.popleft()
	 if n in m:continue
	 m[n] = s
	 q.appendleft((n * 10 % K, s))
	 q.append(((n + 1) % K, s + 1))
	print((m[0]))