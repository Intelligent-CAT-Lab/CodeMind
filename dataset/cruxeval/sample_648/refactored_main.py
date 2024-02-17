list1 = [0, 4, 5, 6]
list2 = [13, 23, -5, 0]
l = list1[:]
while len(l) > 0:
    if l[-1] in list2:
        l.pop()
    else:
        print(l[-1])
        break
else:
    print('missing')