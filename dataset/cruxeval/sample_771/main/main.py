def f(items):
    items = list(items)
    odd_positioned = []
    while len(items) > 0:
        position = items.index(min(items))
        items.pop(position)
        item = items.pop(position)
        odd_positioned.append(item)
    return odd_positioned