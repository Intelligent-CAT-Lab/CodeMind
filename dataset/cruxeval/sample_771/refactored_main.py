items = list((1, 2, 3, 4, 5, 6, 7, 8))
odd_positioned = []
while len(items) > 0:
    position = items.index(min(items))
    items.pop(position)
    item = items.pop(position)
    odd_positioned.append(item)
print(odd_positioned)