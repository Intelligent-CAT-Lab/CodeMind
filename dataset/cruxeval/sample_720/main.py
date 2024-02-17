def f(items, item):
    while items[-1] == item:
        items.pop()
    items.append(item)
    return len(items)