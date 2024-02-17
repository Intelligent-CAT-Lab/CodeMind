from functools import reduce
print(reduce( lambda x, y: x*y, [ x for x in range(1, 1501) ] )+2)
for i in range(1, int(input())+1): print(i+1)