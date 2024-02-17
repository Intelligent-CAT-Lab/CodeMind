class main:
	MOD = 10 ** 9 + 7
	
	N, M = list(map(int, input().split()))
	
	f = []
	p = 2
	while p * p <= M:
	    if M % p != 0:
	        p += 1
	        continue
	    c = 0
	    while M % p == 0:
	        c += 1
	        M //= p
	    f.append(c)
	    p += 1
	if M != 1:
	    f.append(1)
	
	ans = 1
	for i in f:
	    c = 1
	    for j in range(i):
	        c = c * (N + j) // (j + 1)
	    ans = ans * c % MOD
	print(ans)
