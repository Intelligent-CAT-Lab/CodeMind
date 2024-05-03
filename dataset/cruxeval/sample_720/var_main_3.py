def f(items, item):
    while items[-1] == item:	## <state>items = CLRJ | item = CLRJ</state>
        items.pop()
    items.append(item)	## <state>items = CLRJ | item = CLRJ</state>
    return len(items)	## <state>items = CLRJ</state>
