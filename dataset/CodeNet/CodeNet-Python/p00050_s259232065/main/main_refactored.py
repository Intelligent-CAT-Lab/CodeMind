class main:
	s = eval(input())
	s = s.replace("apple", "X")
	s = s.replace("peach", "apple")
	s = s.replace("X", "peach")
	print(s)
	
