def f(d):
    key1 = sorted(d.items(), key=lambda x: x[0], reverse=True)[0][0]	## key1 = CLRJ | d = CLRJ | x = CLRJ
    val1 = d.pop(key1)	## val1 = CLRJ | d = CLRJ | key1 = CLRJ
    key2 = sorted(d.items(), key=lambda x: x[0], reverse=True)[0][0]	## key2 = CLRJ | d = CLRJ | x = CLRJ
    val2 = d.pop(key2)	## val2 = CLRJ | d = CLRJ | key2 = CLRJ
    return dict({key1: val1, key2: val2})	## key1 = CLRJ | key2 = CLRJ | val1 = CLRJ | val2 = CLRJ
