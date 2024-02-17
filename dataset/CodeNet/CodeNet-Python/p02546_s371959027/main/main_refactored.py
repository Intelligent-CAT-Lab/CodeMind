class main:
	S = eval(input())
	
	if S[len(S)-1] == "s":
	    ans = S+"es"
	else:
	    ans = S+"s"
	    
	print(ans)
