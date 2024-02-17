a,b=map(int,input().split())
mydict = {1:"a", 2:"c", 3:"a", 4:"b", 
          5:"a", 6:"b", 7:"a", 8:"a", 9:"b", 10:"a", 11:"b", 12:"a"}
if mydict[a] == mydict[b]:
  print("Yes")
else:
  print("No")