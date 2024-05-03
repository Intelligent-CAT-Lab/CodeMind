def f(dictionary):
    dictionary[1049] = 55	## dictionary = CLRJ
    key, value = dictionary.popitem()	## key = CLRJ | value = CLRJ | dictionary = CLRJ
    dictionary[key] = value	## dictionary = CLRJ | key = CLRJ | value = CLRJ
    return dictionary	## dictionary = CLRJ
