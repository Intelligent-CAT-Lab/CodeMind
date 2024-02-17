array = {}
elem = 1
result = array.copy()
while result:
    key, value = result.popitem()
    if elem == key or elem == value:
        result.update(array)
    del result[key]
print(result)