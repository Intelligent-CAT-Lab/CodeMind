stdata = [('Juan Whelan',90),('Sabah Colley',88),('Peter Nichols',7),('Juan Whelan',122),('Sabah Colley',84)]
temp = defaultdict(int)
for name, marks in stdata:
    temp[name] += marks
print(max(temp.items(), key=lambda x: x[1]))