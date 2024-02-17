class main:
	S = eval(input())
	for i in range(len(S)):
	    for j in range(i,len(S)+1):
	        if S[:i]+S[j:] == "keyence":
	            print("YES")
	            exit()
	for k in range(len(S)):
	    if S[i::i+8] == "keyence":
	        print("YES")
	        exit()
	print("NO")