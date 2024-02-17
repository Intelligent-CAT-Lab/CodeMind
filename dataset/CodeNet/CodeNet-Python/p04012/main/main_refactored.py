class main:
	# coding = SJIS
	Alfa = "abcdefghijklmnopqrstuvwxyz"
	w = str(eval(input()))
	for i in Alfa:
	    if w.count(i) % 2 == 1:
	        print("No")
	        exit()
	print("Yes")