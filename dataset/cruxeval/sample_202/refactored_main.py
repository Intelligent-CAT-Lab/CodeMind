array = [2, 15]
list = [15, 1]
array.extend(list)
[e for e in array if e % 2 == 0]
print([e for e in array if e >= 10])