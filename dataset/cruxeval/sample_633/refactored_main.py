array = [5, -3, 3, 2]
elem = 2
array.reverse()
try:
    found = array.index(elem)
finally:
    array.reverse()
print(found)