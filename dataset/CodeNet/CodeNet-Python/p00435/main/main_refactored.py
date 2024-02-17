class main:
	w=eval(input())
	list=[]
	for i in range(len(w)):
	    if w[i]=='C':
	        list.append('Z')
	        
	    elif w[i]=='B':
	        list.append('Y')
	        
	    elif w[i]=='A':
	        list.append('X')
	    else:
	        c=ord(w[i])-3
	        list.append(chr(c))
	l=''.join(list)
	print(l)
	    
