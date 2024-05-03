def f(d, k):
    new_d = {}	## <state>new_d = CLRJ</state>
    for key, val in d.items():	## <state>key = CLRJ | val = CLRJ | d = CLRJ</state>
        if key < k:	## <state>key = CLRJ | k = CLRJ</state>
            new_d[key] = val	## <state>new_d = CLRJ | key = CLRJ | val = CLRJ</state>
    return new_d	## <state>new_d = CLRJ</state>
