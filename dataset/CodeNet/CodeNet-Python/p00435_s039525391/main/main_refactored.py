class main:
	a = eval(input())
	line = ""
	for i in range(len(a)):
	    if i == len(a)-1:
	        if a[-1]== "A":
	            line += "X"
	        elif a[-1] == "B":
	            line += "Y"
	        elif a[-1]== "C":
	            line += "Z"
	        else:
	            line += str(chr(ord(a[-1])-3))
	    
	    else:
	        if a[i]== "A":
	            line += "X"
	        elif a[i] == "B":
	            line += "Y"
	        elif a[i]== "C":
	            line += "Z"
	        else:
	            line += str(chr(ord(a[i])-3))
	print(line)