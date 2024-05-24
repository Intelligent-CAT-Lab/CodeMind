data_list = [1, 2, [3,4],[5,6]]
total = 0
for element in data_list:
    if type(element) == type([]):
        total = total + recursive_list_sum(element)
    else:
        total = total + element
print(total)