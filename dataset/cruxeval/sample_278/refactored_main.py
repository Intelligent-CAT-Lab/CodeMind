array1 = [0, 132]
array2 = [5, 991, 32, 997]
result = dict.fromkeys(array1)
for key in result:
    result[key] = [el for el in array2 if key * 2 > el]
print(result)