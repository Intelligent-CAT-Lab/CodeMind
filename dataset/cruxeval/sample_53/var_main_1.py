def f(text):
    occ = {}	## occ = CLRJ
    for ch in text:	## ch = CLRJ | text = CLRJ
        name = {'a': 'b', 'b': 'c', 'c': 'd', 'd': 'e', 'e': 'f'}	## name = CLRJ
        name = name.get(ch, ch)	## name = CLRJ | ch = CLRJ
        occ[name] = occ.get(name, 0) + 1	## occ = CLRJ | name = CLRJ
    return [x for _, x in occ.items()]	## x = CLRJ | _ = CLRJ | occ = CLRJ
