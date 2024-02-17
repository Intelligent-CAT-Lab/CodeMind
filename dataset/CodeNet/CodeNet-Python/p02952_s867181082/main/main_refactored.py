class main:
	i = eval(input())
	n = int(i)
	len = len(i)
	
	if len == 1:
	  print(n)
	elif len == 2:
	  print((9))
	elif len == 3:
	  print((n - 90)) # 2桁の数は90こ
	elif len == 4:
	  print((909)) # 999 - 90
	elif len == 5:
	  print((n - 90 - 9000)) # 4桁の数は (9999 - 999)
	elif len == 6:
	  print((90909))