class main:
	dic = {"A":1,"B":2,"C":3,"D":4,"E":5,"F":6}
	X,Y = input().split()
	for key in dic:
	    if key == X:
	        x = dic[key]
	    if key == Y:
	        y = dic[key]
	if x > y:
	    print('>')
	elif x < y:
	    print('<')
	else:
	    print('=')