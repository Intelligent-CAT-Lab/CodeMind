def f(items):
    items = list(items)
    odd_positioned = []
    while len(items) > 0:
        position = items.index(min(items))
        items.pop(position)
        item = items.pop(position)
        odd_positioned.append(item)
    return odd_positioned
f((1, 2, 3, 4, 5, 6, 7, 8))