def f(text):
    occ = {}	## {"occ" : ''}
    for ch in text:	## {"ch" : '',"text" : ''}
        name = {'a': 'b', 'b': 'c', 'c': 'd', 'd': 'e', 'e': 'f'}	## {"name" : ''}
        name = name.get(ch, ch)	## {"name" : '',"ch" : ''}
        occ[name] = occ.get(name, 0) + 1	## {"occ" : '',"name" : ''}
    return [x for _, x in occ.items()]	## {"x" : '',"_" : '',"occ" : ''}
