class main:
	s=input()
	f=0
	for i in range(len(s)):
	    if "C"==s[i] and f==0:
	        f+=1
	    if f==1 and "F"==s[i]:
	        print("Yes")
	        exit()
	print("No")