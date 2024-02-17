array = [4, 8, 17, 89, 43, 14]
array_2 = []
for i in array:
    if i>0:
        array_2 += [i]
array_2.sort(reverse=True)
print(array_2)