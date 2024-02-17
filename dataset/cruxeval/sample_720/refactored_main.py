items = 'bfreratrrbdbzagbretaredtroefcoiqrrneaosf'.split('-')
item = 'n'
while items[-1] == item:
    items.pop()
items.append(item)
print(len(items))