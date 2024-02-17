a,b,c=map(int,input().split())
if c <= a:
 print("0")
elif c <= a+b:
 print(c-a)
else:
 print("NA")