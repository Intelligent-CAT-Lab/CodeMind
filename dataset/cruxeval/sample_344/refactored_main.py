list = [6, 4, 2, 8, 15]
operation = (lambda x: x.reverse())
new_list = list[:]
new_list.sort()
operation(new_list)
print(list)