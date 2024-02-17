def f(items, target):
    for i in items.split():
        if i in target:
            return items.index(i)+1
        if i.index('.') == len(i)-1 or i.index('.') == 0:
            return 'error'
    return '.'