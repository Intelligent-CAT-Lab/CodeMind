values = [1, 1]
item1 = 2
item2 = 3
if values[-1] == item2:
    if values[0] not in values[1:]:
        values.append(values[0])
elif values[-1] == item1:
    if values[0] == item2:
        values.append(values[0])

print(values)