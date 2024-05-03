def f(string):
    tmp = string.lower()	## tmp = CLRJ | string = CLRJ
    for char in string.lower():	## char = CLRJ | string = CLRJ
        if char in tmp:	## char = CLRJ | tmp = CLRJ
            tmp = tmp.replace(char, '', 1)	## tmp = CLRJ | char = CLRJ
    return tmp	## tmp = CLRJ
