d = {'X': ['x', 'y']}
dCopy = d.copy()
for key, value in dCopy.items():
    for i in range(len(value)):
        value[i] = value[i].upper()
print(dCopy)