class main:
	S = eval(input())
	A = 'CODEFESTIVAL2016'
	ans = 0
	for i in range(len(S)):
	  if S[i] != A[i]:
	    ans += 1
	
	print(ans)
