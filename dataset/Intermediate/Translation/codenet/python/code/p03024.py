x=input()
a=0
for i in x:
  if i=='x':
    a+=1
print(["NO","YES"][a<=7])