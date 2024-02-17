a,b = [int(x) for x in "8 6".split()]
j = [2,3,4,5,6,7,8,9,10,11,12,13,1]
if j.index(a) > j.index(b):
  print('Alice')
elif j.index(a) < j.index(b):
  print('Bob')
else:
  print('Draw')
