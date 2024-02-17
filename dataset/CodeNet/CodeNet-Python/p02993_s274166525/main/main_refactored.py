class main:
	s = eval(input())
	for i in range(len(s)-1):
	    if s[i] == s[i+1]:
	        print("Bad")
	        exit()
	print("Good")
