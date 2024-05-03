def f(items):
    items = list(items)	## items = CLRJ
    odd_positioned = []	## odd_positioned = CLRJ
    while len(items) > 0:	## items = CLRJ
        position = items.index(min(items))	## position = CLRJ | items = CLRJ
        items.pop(position)	## items = CLRJ | position = CLRJ
        item = items.pop(position)	## item = CLRJ | items = CLRJ | position = CLRJ
        odd_positioned.append(item)	## odd_positioned = CLRJ | item = CLRJ
    return odd_positioned	## odd_positioned = CLRJ
