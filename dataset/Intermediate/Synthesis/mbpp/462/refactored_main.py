list1 = ['orange', 'red', 'green', 'blue']
if len(list1) == 0:
    print([[]])
result = []
for el in combinations_list(list1[1:]):
    result += [el, el+[list1[0]]]
print(result)