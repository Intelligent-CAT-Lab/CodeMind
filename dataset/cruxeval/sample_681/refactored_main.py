array = [1, 5, 8, 2, 0, 3]
ind = 2
elem = 7
array.insert(-5 if ind < 0 else len(array) if ind > len(array) else ind + 1, elem)
print(array)