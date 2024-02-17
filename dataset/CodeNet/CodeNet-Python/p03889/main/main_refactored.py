class main:
	s = list(eval(input()))
	t = s[::-1]
	for i in range(len(t)):
	  if t[i] == "p":
	    t[i] = "q"
	  elif t[i] == "q":
	    t[i] = "p"
	  if t[i] == "b":
	    t[i] = "d"
	  elif t[i] == "d":
	    t[i] = "b" 
	if s == t:
	  ans = "Yes"
	else:
	  ans = "No"
	print(ans)
	    