class main:
	S = eval(input())
	
	alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
	Now = 0
	ans = 0
	for s in S:
	    Next = alpha.find(s)
	    # print(s, Now, Next)
	
	    if(Now < Next):
	        pass
	    else:
	        ans += 1
	    Now = Next
	print(ans)
