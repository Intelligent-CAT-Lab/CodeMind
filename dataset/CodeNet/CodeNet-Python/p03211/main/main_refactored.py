class main:
	S=str(eval(input()))
	a=99999
	for i in range(len(S)-2):
	  a=min(abs(753-int(S[i]+S[i+1]+S[i+2])),a)
	  
	print(a)