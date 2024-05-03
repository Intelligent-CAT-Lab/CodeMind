def f(values, value):
    length = len(values)	## length = CLRJ | values = CLRJ
    new_dict = dict.fromkeys(values, value)	## new_dict = CLRJ | values = CLRJ | value = CLRJ
    new_dict[''.join(sorted(values))] = value * 3	## new_dict = CLRJ | values = CLRJ | value = CLRJ
    return new_dict	## new_dict = CLRJ
