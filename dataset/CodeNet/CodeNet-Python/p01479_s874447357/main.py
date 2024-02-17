a = raw_input().replace("egg","0").replace("chicken","1")
for i in range(len(a)-2,-1,-1):
	if a[i] == a[i+1]: a = a[:i+1] + " " + a[i+1:]
a = sorted(a.split(), key = lambda x:len(x), reverse = True)
print "egg" if a[0][-1] == "0" else "chicken"