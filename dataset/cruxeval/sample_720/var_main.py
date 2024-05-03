def f(items, item):
    while items[-1] == item:	## {"items" : '',"item" : ''}
        items.pop()
    items.append(item)	## {"items" : '',"item" : ''}
    return len(items)	## {"items" : ''}
