def f(items, target):
    for i in items.split():	## {"i" : '',"items" : ''}
        if i in target:	## {"i" : '',"target" : ''}
            return items.index(i)+1
        if i.index('.') == len(i)-1 or i.index('.') == 0:	## {"i" : ''}
            return 'error'
    return '.'