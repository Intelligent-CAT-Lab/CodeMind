array = [-1, 2, 1, -8, 2]
elem = 2
ind = array.index(elem)
print(ind * 2 + array[-ind - 1] * 3)