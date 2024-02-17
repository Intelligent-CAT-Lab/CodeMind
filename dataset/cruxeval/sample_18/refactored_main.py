array = [5, 4, 3, 2, 1, 0]
elem = 3
k = 0
l = array.copy()
for i in l:
    if i > elem:
        array.insert(k, elem)
        break
    k += 1
print(array)