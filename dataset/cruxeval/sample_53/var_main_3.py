def f(text):
    occ = {}	## <state>occ = CLRJ</state>
    for ch in text:	## <state>ch = CLRJ | text = CLRJ</state>
        name = {'a': 'b', 'b': 'c', 'c': 'd', 'd': 'e', 'e': 'f'}	## <state>name = CLRJ</state>
        name = name.get(ch, ch)	## <state>name = CLRJ | ch = CLRJ</state>
        occ[name] = occ.get(name, 0) + 1	## <state>occ = CLRJ | name = CLRJ</state>
    return [x for _, x in occ.items()]	## <state>x = CLRJ | _ = CLRJ | occ = CLRJ</state>
