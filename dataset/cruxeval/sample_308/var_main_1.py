def f(strings):
    occurances = {}	## occurances = CLRJ
    for string in strings:	## string = CLRJ | strings = CLRJ
        if string not in occurances:	## string = CLRJ | occurances = CLRJ
            occurances[string] = strings.count(string)	## occurances = CLRJ | string = CLRJ | strings = CLRJ
    return occurances	## occurances = CLRJ
