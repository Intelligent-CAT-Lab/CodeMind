def f(dictionary, key):
    del dictionary[key]	## dictionary = CLRJ | key = CLRJ
    if min(dictionary) == key:	## dictionary = CLRJ | key = CLRJ
        key = list(dictionary)[0]
    return key	## key = CLRJ
