class main:
	s = eval(input())
	ans = ""
	flag = False
	for c in s:
	  if c == "A" and not flag:flag = True
	  if c == "Z" and flag:
	    ans += "AZ"
	    flag = False
	if ans == "":
	  print((-1))
	else:
	  print(ans)
