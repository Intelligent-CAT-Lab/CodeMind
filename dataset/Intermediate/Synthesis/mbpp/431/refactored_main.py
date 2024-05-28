list1 = [1,2,3,4,5]
list2 = [5,6,7,8,9]
result = False
for x in list1:
    for y in list2:
        if x == y:
            result = True
            break
print(result)