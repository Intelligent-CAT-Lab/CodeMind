class main:
	s = input()
	k = x = 0
	try:
	        while 1:
	                cj = co = ci = 0
	                while s[x] == "J":
	                        cj += 1
	                        x += 1
	                while s[x] == "O":
	                        co += 1
	                        x += 1
	                while s[x] == "I":
	                        ci += 1
	                        x += 1
	                if co <= cj and co <= ci:
	                        k = max(co,k)
	except IndexError:
	        if co <= cj and co <= ci:
	                k = max(co,k)
	        print(k)