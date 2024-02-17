class main:
	N = int(eval(input()))
	P2 = [[0, 0, 0] for _ in range(5000)]
	P3 = [[0, 0] for _ in range(2500)]
	limit = 30000
	for i in range(5000):
	  P2[i] = [6 * (i + 1) - 2, 6 * (i + 1), 6 * (i + 1) + 2]
	P2[-1][-1] = 2
	for i in range(2500):
	  P3[i] = [12 * i + 3, 12 * i + 9]
	if N == 3:
	  print((2,3,25))
	elif N == 4:
	  print((2,3,4,9))
	elif N == 6:
	  print((2,3,4,6,9,12))
	else:
	  def SP(N):
	    if N == 19999:
	      P = P2 + P3
	      P[0] = [4, 8]
	      return P
	    _k = -(-max(N - 12500, 0) // 3)
	    N -= 3 * _k
	    k = N // 5
	    m = N % 5
	    if m == 0:
	      P = P2[:k + _k] + P3[:k]
	    elif m == 1:
	      P = P2[:k + 1 + _k] + P3[:k - 1]
	    elif m == 2:
	      P = P2[:k + _k] + P3[:k + 1]
	    elif m == 3:
	      P = P2[:k + 1 + _k] + P3[:k]
	    elif k >= 2499:
	      P = P2[:k + 2 + _k] + P3[:k - 1]
	    else:
	      P = P2[:k + _k] + P3[:k + 2]
	    return P
	  P = SP(N)
	  print((' '.join([' '.join([str(_p) for _p in p]) for p in P])))