array = [58]
values = [21, 92]
array.reverse()
for value in values:
    array.insert(len(array) // 2, value)
array.reverse()
print(array)