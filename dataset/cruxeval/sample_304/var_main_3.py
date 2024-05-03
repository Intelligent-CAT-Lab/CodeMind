def f(d):
    key1 = sorted(d.items(), key=lambda x: x[0], reverse=True)[0][0]	## <state>key1 = CLRJ | d = CLRJ | x = CLRJ</state>
    val1 = d.pop(key1)	## <state>val1 = CLRJ | d = CLRJ | key1 = CLRJ</state>
    key2 = sorted(d.items(), key=lambda x: x[0], reverse=True)[0][0]	## <state>key2 = CLRJ | d = CLRJ | x = CLRJ</state>
    val2 = d.pop(key2)	## <state>val2 = CLRJ | d = CLRJ | key2 = CLRJ</state>
    return dict({key1: val1, key2: val2})	## <state>key1 = CLRJ | key2 = CLRJ | val1 = CLRJ | val2 = CLRJ</state>
