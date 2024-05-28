list1 = [1,2,'abc',1.2]
ctr = 0
for i in list1:
    if isinstance(i, int):
        ctr = ctr + 1
print(ctr)