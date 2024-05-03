def f(items, target):
    for i in items.split():	## i = CLRJ | items = CLRJ
        if i in target:	## i = CLRJ | target = CLRJ
            return items.index(i)+1
        if i.index('.') == len(i)-1 or i.index('.') == 0:	## i = CLRJ
            return 'error'
    return '.'