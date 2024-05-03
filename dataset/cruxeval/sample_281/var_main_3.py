def f(c, index, value):
    c[index] = value	## <state>c = CLRJ | index = CLRJ | value = CLRJ</state>
    if value >= 3:	## <state>value = CLRJ</state>
        c.update({'message' : 'xcrWt'})
    else: 
        del c['message']	## <state>c = CLRJ</state>
    return c	## <state>c = CLRJ</state>
