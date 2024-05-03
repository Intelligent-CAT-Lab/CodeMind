def f(d):
    keys = []	## <state>keys = CLRJ</state>
    for k in d:	## <state>k = CLRJ | d = CLRJ</state>
        keys.append('%s => %s' % (k, d[k]))	## <state>keys = CLRJ | k = CLRJ | d = CLRJ</state>
    return keys	## <state>keys = CLRJ</state>
