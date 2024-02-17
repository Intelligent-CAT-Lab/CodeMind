a,b,c=map(int,"1000 3000 3000".split())
if c <= a:
 print("0")
elif c <= a+b:
 print(c-a)
else:
 print("NA")