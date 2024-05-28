list1 = [[1, 3], [5, 7], [1, 3], [13, 15, 17], [5, 7], [9, 11]]
result ={}
for l in  list1: 
    result.setdefault(tuple(l), list()).append(1) 
for a, b in result.items(): 
    result[a] = sum(b)
print(result)