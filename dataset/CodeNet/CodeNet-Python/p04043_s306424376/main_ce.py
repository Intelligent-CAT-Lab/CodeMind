import itertools
a="5 5 7".split()
#print(type(a))
b=itertools.permutations('575')
b=list(b)
flag=0
for i in range(len(list(b))):
  c=b[i][0]+b[i][1]+b[i][2]
#  print(type(c))
  if list(c)==a:
    flag=1
print('YES' if flag==1 else 'NO' )
               