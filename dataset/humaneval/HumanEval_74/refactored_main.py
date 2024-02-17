lst1 = ['hi', 'admin']
lst2 = ['hi', 'hi'] 

l1 = 0
for st in lst1:
    l1 += len(st)

l2 = 0
for st in lst2:
    l2 += len(st)

if l1 <= l2:
    print(lst1)
else:
    print(lst2)