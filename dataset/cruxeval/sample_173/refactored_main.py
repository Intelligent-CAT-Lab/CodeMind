list_x = [5, 8, 6, 8, 4]
item_count = len(list_x)
new_list = []
for i in range(item_count):
    new_list.append(list_x.pop())
print(new_list)