def f(list_x):
    item_count = len(list_x)
    new_list = []
    for i in range(item_count):
        new_list.append(list_x.pop())
    return new_list