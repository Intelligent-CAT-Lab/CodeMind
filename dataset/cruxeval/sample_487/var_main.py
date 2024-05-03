def f(dict):
    even_keys = []	## {"even_keys" : ''}
    for key in dict.keys():	## {"key" : '',"dict" : ''}
        if key % 2 == 0:	## {"key" : ''}
            even_keys.append(key)	## {"even_keys" : '',"key" : ''}
    return even_keys	## {"even_keys" : ''}
