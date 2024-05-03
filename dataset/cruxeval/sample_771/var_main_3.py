def f(items):
    items = list(items)	## <state>items = CLRJ</state>
    odd_positioned = []	## <state>odd_positioned = CLRJ</state>
    while len(items) > 0:	## <state>items = CLRJ</state>
        position = items.index(min(items))	## <state>position = CLRJ | items = CLRJ</state>
        items.pop(position)	## <state>items = CLRJ | position = CLRJ</state>
        item = items.pop(position)	## <state>item = CLRJ | items = CLRJ | position = CLRJ</state>
        odd_positioned.append(item)	## <state>odd_positioned = CLRJ | item = CLRJ</state>
    return odd_positioned	## <state>odd_positioned = CLRJ</state>
