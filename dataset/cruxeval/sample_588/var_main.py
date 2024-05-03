def f(items, target):
    if target in items:	## {"target" : '',"items" : ''}
        return items.index(target)	## {"items" : '',"target" : ''}
    return -1