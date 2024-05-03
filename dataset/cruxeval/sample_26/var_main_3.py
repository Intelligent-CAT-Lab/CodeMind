def f(items, target):
    for i in items.split():	## <state>i = CLRJ | items = CLRJ</state>
        if i in target:	## <state>i = CLRJ | target = CLRJ</state>
            return items.index(i)+1
        if i.index('.') == len(i)-1 or i.index('.') == 0:	## <state>i = CLRJ</state>
            return 'error'
    return '.'