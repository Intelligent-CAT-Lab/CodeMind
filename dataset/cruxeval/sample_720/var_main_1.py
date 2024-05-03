def f(items, item):
    while items[-1] == item:	## items = CLRJ | item = CLRJ
        items.pop()
    items.append(item)	## items = CLRJ | item = CLRJ
    return len(items)	## items = CLRJ
