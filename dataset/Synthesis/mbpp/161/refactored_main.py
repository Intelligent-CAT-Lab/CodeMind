list1 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
list2 = [2, 4, 6, 8]
result = [x for x in list1 if x not in list2]
print(result)