def f(dictionary, key):
    del dictionary[key]	## {"dictionary" : '',"key" : ''}
    if min(dictionary) == key:	## {"dictionary" : '',"key" : ''}
        key = list(dictionary)[0]
    return key	## {"key" : ''}
