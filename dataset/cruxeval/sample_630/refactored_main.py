original = {1: -9, 0: -7}
string = {1: 2, 0: 3}
temp = dict(original)
for a, b in string.items():
    temp[b] = a
print(temp)